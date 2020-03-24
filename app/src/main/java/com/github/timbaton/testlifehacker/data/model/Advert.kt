package com.github.timbaton.testlifehacker.data.model


import com.fasterxml.jackson.annotation.JsonProperty

data class Advert(
    @JsonProperty("link")
    val link: String?,
    @JsonProperty("logo")
    val logo: String?
)