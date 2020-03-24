package com.github.timbaton.testlifehacker.data.model


import com.fasterxml.jackson.annotation.JsonProperty

data class Content(
    @JsonProperty("protected")
    val `protected`: Boolean?,
    @JsonProperty("rendered")
    val rendered: String?
)