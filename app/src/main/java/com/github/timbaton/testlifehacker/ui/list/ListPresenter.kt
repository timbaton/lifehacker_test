package com.github.timbaton.testlifehacker.ui.list

import com.github.timbaton.testlifehacker.data.PostRepository
import com.github.timbaton.testlifehacker.data.toPostEntityList
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import moxy.InjectViewState
import moxy.MvpPresenter

@InjectViewState
class ListPresenter(
    private val postRepository: PostRepository
) : MvpPresenter<ListView>() {

    val disposables = CompositeDisposable()
    override fun onFirstViewAttach() {
        super.onFirstViewAttach()

        loadPosts()
    }

    private fun loadPosts() {
        disposables.addAll(
            postRepository.loadPosts()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .map {
                    it.toPostEntityList()
                }
                .subscribe({
                    viewState.showList(it)
                }, {
                    viewState.showMessage(it.message.toString())
                })
        )
    }

    override fun onDestroy() {
        super.onDestroy()
        disposables.clear()
    }

    fun onPostClicked(id: Long) {
        viewState.navigateTo(ListFragmentDirections.actionListFragmentToContentFragment(id))
    }
}