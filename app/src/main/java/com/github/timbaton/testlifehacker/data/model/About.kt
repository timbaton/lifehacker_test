package com.github.timbaton.testlifehacker.data.model


import com.fasterxml.jackson.annotation.JsonProperty

data class About(
    @JsonProperty("href")
    val href: String?
)