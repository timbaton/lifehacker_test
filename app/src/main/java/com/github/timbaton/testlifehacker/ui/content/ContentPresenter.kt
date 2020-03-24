package com.github.timbaton.testlifehacker.ui.content

import com.github.timbaton.testlifehacker.data.PostRepository
import moxy.InjectViewState
import moxy.MvpPresenter

@InjectViewState
class ContentPresenter(
    private val postRepository: PostRepository
) : MvpPresenter<ContentView>() {

    var postId = 0L

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()

        getCurrentPost(postId)
    }

    private fun getCurrentPost(postId: Long) {
        val posts = postRepository.getCachedPost()

        val currentPost = posts.first {
            it.id == postId
        }

        viewState.showPostInfo(currentPost)
    }
}