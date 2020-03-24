package com.github.timbaton.testlifehacker.ui.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.github.timbaton.testlifehacker.R
import com.github.timbaton.testlifehacker.di.postComponent
import com.github.timbaton.testlifehacker.entity.Post
import kotlinx.android.synthetic.main.fragment_list.*
import moxy.MvpAppCompatFragment
import moxy.presenter.InjectPresenter
import moxy.presenter.ProvidePresenter

class ListFragment : MvpAppCompatFragment(), ListView {

    @InjectPresenter
    lateinit var presenter: ListPresenter

    @ProvidePresenter
    fun providePresenter() = postComponent.listPresenter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View =
        inflater.inflate(R.layout.fragment_list, container, false)

    private val adapter = PostListAdapter {
        presenter.onPostClicked(it)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rv_posts.adapter = adapter
        rv_posts.layoutManager = LinearLayoutManager(requireContext())
    }

    override fun showList(list: List<Post>) {
        adapter.submitList(list)
    }

    override fun showMessage(message: String) {
        Toast.makeText(requireContext(), message, Toast.LENGTH_SHORT).show()
    }

    override fun navigateTo(actionListFragmentToContentFragment: NavDirections) {
        findNavController().navigate(actionListFragmentToContentFragment)
    }
}