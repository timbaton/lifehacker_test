package com.github.timbaton.testlifehacker.data.model


import com.fasterxml.jackson.annotation.JsonProperty

data class WpAttachment(
    @JsonProperty("href")
    val href: String?
)