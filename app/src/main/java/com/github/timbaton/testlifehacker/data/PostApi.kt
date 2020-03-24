package com.github.timbaton.testlifehacker.data

import com.github.timbaton.testlifehacker.data.model.PostModel
import io.reactivex.Single
import retrofit2.http.GET

interface PostApi {

    @GET("wp/v2/posts")
    fun loadPosts(): Single<List<PostModel>>
}