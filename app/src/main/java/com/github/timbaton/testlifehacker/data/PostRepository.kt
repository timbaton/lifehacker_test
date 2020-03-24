package com.github.timbaton.testlifehacker.data

import com.github.timbaton.testlifehacker.data.model.PostModel
import com.github.timbaton.testlifehacker.entity.Post
import io.reactivex.Single

class PostRepository(private val api: PostApi) {

    private var cachedPosts = mutableListOf<Post>()

    fun loadPosts(): Single<List<PostModel>> {
        return api.loadPosts()
            .doOnSuccess {
                cachedPosts = it.toPostEntityList()
            }
    }

    fun getCachedPost(): List<Post> {
        return cachedPosts
    }
}