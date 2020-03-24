package com.github.timbaton.testlifehacker.data.model


import com.fasterxml.jackson.annotation.JsonProperty

data class Cury(
    @JsonProperty("href")
    val href: String?,
    @JsonProperty("name")
    val name: String?,
    @JsonProperty("templated")
    val templated: Boolean?
)