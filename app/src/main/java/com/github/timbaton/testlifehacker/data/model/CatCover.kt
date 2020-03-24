package com.github.timbaton.testlifehacker.data.model


import com.fasterxml.jackson.annotation.JsonProperty

data class CatCover(
    @JsonProperty("sizes")
    val sizes: Sizes?
)