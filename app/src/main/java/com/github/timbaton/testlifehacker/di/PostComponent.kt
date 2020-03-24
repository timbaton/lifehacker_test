package com.github.timbaton.testlifehacker.di

import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.databind.ObjectMapper
import com.github.timbaton.testlifehacker.BuildConfig
import com.github.timbaton.testlifehacker.data.PostApi
import com.github.timbaton.testlifehacker.data.PostRepository
import com.github.timbaton.testlifehacker.ui.content.ContentPresenter
import com.github.timbaton.testlifehacker.ui.list.ListPresenter
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.jackson.JacksonConverterFactory
import java.util.concurrent.TimeUnit

val postComponent: PostComponent = PostModule()

interface PostComponent {
    val api: PostApi
    val httpClient: OkHttpClient
    val postRepository: PostRepository

    val contentPresenter: ContentPresenter
    val listPresenter: ListPresenter
}

class PostModule : PostComponent {
    private val BASE_URL: String = BuildConfig.BASE_URL

    override val api: PostApi = kotlin.run {
        val jacksonObjectMapper = ObjectMapper()
        jacksonObjectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)

        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .client(httpClient)
            .addConverterFactory(JacksonConverterFactory.create(jacksonObjectMapper))
            .build()

        retrofit.create(PostApi::class.java)
    }
    override val httpClient: OkHttpClient
        get() = with(OkHttpClient.Builder()) {
            val connectionTimeout = 30L
            val readTimeout = 30L
            connectTimeout(connectionTimeout, TimeUnit.SECONDS)
            readTimeout(readTimeout, TimeUnit.SECONDS)

            addInterceptor {
                val request =
                    it.request().newBuilder().addHeader("Content-Type", "application/json").build()
                it.proceed(request)
            }
            build()
        }

    override val postRepository: PostRepository = PostRepository(api)

    override val contentPresenter: ContentPresenter
        get() = ContentPresenter(postRepository)

    override val listPresenter: ListPresenter
        get() = ListPresenter(postRepository)
}