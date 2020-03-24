package com.github.timbaton.testlifehacker.data.model


import com.fasterxml.jackson.annotation.JsonProperty

data class Author(
    @JsonProperty("embeddable")
    val embeddable: Boolean?,
    @JsonProperty("href")
    val href: String?
)