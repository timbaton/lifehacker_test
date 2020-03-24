package com.github.timbaton.testlifehacker.data.model


import com.fasterxml.jackson.annotation.JsonProperty

data class Links(
    @JsonProperty("about")
    val about: List<About?>?,
    @JsonProperty("author")
    val author: List<Author?>?,
    @JsonProperty("collection")
    val collection: List<Collection?>?,
    @JsonProperty("curies")
    val curies: List<Cury?>?,
    @JsonProperty("predecessor-version")
    val predecessorVersion: List<PredecessorVersion?>?,
    @JsonProperty("replies")
    val replies: List<Reply?>?,
    @JsonProperty("self")
    val self: List<Self?>?,
    @JsonProperty("version-history")
    val versionHistory: List<VersionHistory?>?,
    @JsonProperty("wp:attachment")
    val wpAttachment: List<WpAttachment?>?,
    @JsonProperty("wp:featuredmedia")
    val wpFeaturedmedia: List<WpFeaturedmedia?>?,
    @JsonProperty("wp:term")
    val wpTerm: List<WpTerm?>?
)