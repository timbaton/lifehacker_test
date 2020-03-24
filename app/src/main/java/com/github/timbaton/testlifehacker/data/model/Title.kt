package com.github.timbaton.testlifehacker.data.model


import com.fasterxml.jackson.annotation.JsonProperty

data class Title(
    @JsonProperty("rendered")
    val rendered: String?
)