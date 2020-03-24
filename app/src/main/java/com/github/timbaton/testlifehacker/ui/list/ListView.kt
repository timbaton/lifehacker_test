package com.github.timbaton.testlifehacker.ui.list

import androidx.navigation.NavDirections
import com.github.timbaton.testlifehacker.entity.Post
import moxy.MvpView
import moxy.viewstate.strategy.AddToEndStrategy
import moxy.viewstate.strategy.OneExecutionStateStrategy
import moxy.viewstate.strategy.StateStrategyType

interface ListView : MvpView {

    @StateStrategyType(AddToEndStrategy::class)
    fun showList(list: List<Post>)

    @StateStrategyType(AddToEndStrategy::class)
    fun showMessage(message: String)

    @StateStrategyType(OneExecutionStateStrategy::class)
    fun navigateTo(actionListFragmentToContentFragment: NavDirections)
}