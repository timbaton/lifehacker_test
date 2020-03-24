package com.github.timbaton.testlifehacker.data.model


import com.fasterxml.jackson.annotation.JsonProperty

data class PredecessorVersion(
    @JsonProperty("href")
    val href: String?,
    @JsonProperty("id")
    val id: Int?
)