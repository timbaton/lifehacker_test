package com.github.timbaton.testlifehacker.data.model


import com.fasterxml.jackson.annotation.JsonProperty

data class RelatedX(
    @JsonProperty("author_name")
    val authorName: String?,
    @JsonProperty("clickUrl")
    val clickUrl: String?,
    @JsonProperty("id")
    val id: String?,
    @JsonProperty("thumbnail")
    val thumbnail: String?,
    @JsonProperty("title")
    val title: String?
)