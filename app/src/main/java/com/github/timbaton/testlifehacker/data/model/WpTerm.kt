package com.github.timbaton.testlifehacker.data.model


import com.fasterxml.jackson.annotation.JsonProperty

data class WpTerm(
    @JsonProperty("embeddable")
    val embeddable: Boolean?,
    @JsonProperty("href")
    val href: String?,
    @JsonProperty("taxonomy")
    val taxonomy: String?
)