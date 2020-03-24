package com.github.timbaton.testlifehacker.data.model


import com.fasterxml.jackson.annotation.JsonProperty

data class Guid(
    @JsonProperty("rendered")
    val rendered: String?
)