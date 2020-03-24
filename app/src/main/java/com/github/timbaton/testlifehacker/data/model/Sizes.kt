package com.github.timbaton.testlifehacker.data.model


import com.fasterxml.jackson.annotation.JsonProperty

data class Sizes(
    @JsonProperty("highres")
    val highres: String?,
    @JsonProperty("large")
    val large: String?,
    @JsonProperty("mobile")
    val mobile: String?,
    @JsonProperty("post-thumbnail")
    val postThumbnail: String?
)