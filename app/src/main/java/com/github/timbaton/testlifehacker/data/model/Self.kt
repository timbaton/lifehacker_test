package com.github.timbaton.testlifehacker.data.model


import com.fasterxml.jackson.annotation.JsonProperty

data class Self(
    @JsonProperty("href")
    val href: String?
)