package com.github.timbaton.testlifehacker.data.model


import com.fasterxml.jackson.annotation.JsonProperty

data class VersionHistory(
    @JsonProperty("count")
    val count: Int?,
    @JsonProperty("href")
    val href: String?
)