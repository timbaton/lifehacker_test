package com.github.timbaton.testlifehacker.data.model


import com.fasterxml.jackson.annotation.JsonProperty

data class PostSource(
    @JsonProperty("link")
    val link: String?,
    @JsonProperty("title")
    val title: String?
)