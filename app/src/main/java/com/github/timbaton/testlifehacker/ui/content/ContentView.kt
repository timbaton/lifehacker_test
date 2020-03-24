package com.github.timbaton.testlifehacker.ui.content

import com.github.timbaton.testlifehacker.entity.Post
import moxy.MvpView
import moxy.viewstate.strategy.AddToEndStrategy
import moxy.viewstate.strategy.StateStrategyType

interface ContentView : MvpView {

    @StateStrategyType(AddToEndStrategy::class)
    fun showPostInfo(currentPost: Post)
}