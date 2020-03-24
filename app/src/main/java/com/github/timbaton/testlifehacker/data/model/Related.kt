package com.github.timbaton.testlifehacker.data.model


import com.fasterxml.jackson.annotation.JsonProperty

data class Related(
    @JsonProperty("related")
    val related: List<RelatedX?>?
)