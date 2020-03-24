package com.github.timbaton.testlifehacker.data.model


import com.fasterxml.jackson.annotation.JsonProperty

data class PostModel(
    @JsonProperty("_advert")
    val advert: Advert?,
    @JsonProperty("author")
    val author: Int?,
    @JsonProperty("author_name")
    val authorName: String?,
    @JsonProperty("blank")
    val blank: Int?,
    @JsonProperty("cat_cover")
    val catCover: CatCover?,
    @JsonProperty("categories")
    val categories: List<Int?>?,
    @JsonProperty("comment_status")
    val commentStatus: String?,
    @JsonProperty("comments_number")
    val commentsNumber: String?,
    @JsonProperty("content")
    val content: Content?,
    @JsonProperty("date")
    val date: String?,
    @JsonProperty("date_gmt")
    val dateGmt: String?,
    @JsonProperty("excerpt")
    val excerpt: Excerpt?,
    @JsonProperty("featured_media")
    val featuredMedia: Int?,
    @JsonProperty("format")
    val format: String?,
    @JsonProperty("guid")
    val guid: Guid?,
    @JsonProperty("id")
    val id: Int?,
    @JsonProperty("link")
    val link: String?,
    @JsonProperty("_links")
    val links: Links?,
    @JsonProperty("meta")
    val meta: Meta?,
    @JsonProperty("modified")
    val modified: String?,
    @JsonProperty("modified_gmt")
    val modifiedGmt: String?,
    @JsonProperty("next_post")
    val nextPost: Int?,
    @JsonProperty("ping_status")
    val pingStatus: String?,
    @JsonProperty("post_label")
    val postLabel: String?,
    @JsonProperty("post_source")
    val postSource: PostSource?,
    @JsonProperty("related")
    val related: Related?,
    @JsonProperty("related_new")
    val relatedNew: List<RelatedNew?>?,
    @JsonProperty("ringo_subtitle")
    val ringoSubtitle: String?,
    @JsonProperty("slug")
    val slug: String?,
    @JsonProperty("status")
    val status: String?,
    @JsonProperty("sticky")
    val sticky: Boolean?,
    @JsonProperty("tags")
    val tags: List<Any?>?,
    @JsonProperty("teaser")
    val teaser: String?,
    @JsonProperty("template")
    val template: String?,
    @JsonProperty("title")
    val title: Title?,
    @JsonProperty("type")
    val type: String?,
    @JsonProperty("yst_prominent_words")
    val ystProminentWords: List<Int?>?
)