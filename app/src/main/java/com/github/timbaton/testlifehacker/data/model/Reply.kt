package com.github.timbaton.testlifehacker.data.model


import com.fasterxml.jackson.annotation.JsonProperty

data class Reply(
    @JsonProperty("embeddable")
    val embeddable: Boolean?,
    @JsonProperty("href")
    val href: String?
)