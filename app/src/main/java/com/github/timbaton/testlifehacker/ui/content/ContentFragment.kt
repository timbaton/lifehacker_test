package com.github.timbaton.testlifehacker.ui.content

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.github.timbaton.testlifehacker.R
import com.github.timbaton.testlifehacker.di.postComponent
import com.github.timbaton.testlifehacker.entity.Post
import kotlinx.android.synthetic.main.fragment_content.*
import kotlinx.android.synthetic.main.item_post.tv_title
import moxy.MvpAppCompatFragment
import moxy.presenter.InjectPresenter
import moxy.presenter.ProvidePresenter


class ContentFragment : MvpAppCompatFragment(), ContentView {

    @InjectPresenter
    lateinit var presenter: ContentPresenter

    @ProvidePresenter
    fun providePresenter() = postComponent.contentPresenter.apply {
        postId = args.postId
    }

    private val args: ContentFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View =
        inflater.inflate(R.layout.fragment_content, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        wv_content.settings.javaScriptEnabled = true
        wv_content.settings.setSupportZoom(true)
        wv_content.settings.domStorageEnabled = true
        wv_content.settings.builtInZoomControls = true
        wv_content.settings.displayZoomControls = false
    }

    override fun showPostInfo(currentPost: Post) {
        tv_title.text = currentPost.title

        wv_content.loadData(currentPost.content, "text/html; charset=utf-8", "UTF-8");
    }
}