package com.github.timbaton.testlifehacker.data.model


import com.fasterxml.jackson.annotation.JsonProperty

data class Meta(
    @JsonProperty("amp_status")
    val ampStatus: String?
)