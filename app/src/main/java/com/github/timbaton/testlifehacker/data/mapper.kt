package com.github.timbaton.testlifehacker.data

import com.github.timbaton.testlifehacker.data.model.PostModel
import com.github.timbaton.testlifehacker.entity.Post

fun List<PostModel>.toPostEntityList(): MutableList<Post> {
    val list = mutableListOf<Post>()
    this.forEach { elem ->
        list.add(
            Post(
                elem.id?.toLong() ?: 0L,
                elem.title?.rendered ?: "",
                elem.content?.rendered ?: "",
                elem.catCover?.sizes?.mobile ?: ""
            )
        )
    }

    return list
}