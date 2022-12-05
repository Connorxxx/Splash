package com.connor.network.model


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PhotoItem(
    @SerialName("blur_hash")
    val blurHash: String? = "",
    val color: String? = "",
    @SerialName("created_at")
    val createdAt: String? = "",
    val description: String? = "",
    val height: Int? = 0,
    val id: String? = "",
    @SerialName("liked_by_user")
    val likedByUser: Boolean? = false,
    val likes: Int? = 0,
    val links: Links? = Links(),
    @SerialName("promoted_at")
    val promotedAt: String? = "",
    val sponsorship: Sponsorship? = Sponsorship(),
    @SerialName("topic_submissions")
    val topicSubmissions: TopicSubmissions? = TopicSubmissions(),
    @SerialName("updated_at")
    val updatedAt: String? = "",
    val urls: Urls? = Urls(),
    val user: User? = User(),
    val width: Int? = 0
) {
    @Serializable
    data class Links(
        val download: String? = "",
        @SerialName("download_location")
        val downloadLocation: String? = "",
        val html: String? = "",
        val self: String? = ""
    )

    @Serializable
    data class Sponsorship(
        @SerialName("impression_urls")
        val impressionUrls: List<String?>? = listOf(),
        val sponsor: Sponsor? = Sponsor(),
        val tagline: String? = "",
        @SerialName("tagline_url")
        val taglineUrl: String? = ""
    ) {
        @Serializable
        data class Sponsor(
            @SerialName("accepted_tos")
            val acceptedTos: Boolean? = false,
            val bio: String? = "",
            @SerialName("first_name")
            val firstName: String? = "",
            @SerialName("for_hire")
            val forHire: Boolean? = false,
            val id: String? = "",
            @SerialName("instagram_username")
            val instagramUsername: String? = "",
            @SerialName("last_name")
            val lastName: String? = "",
            val links: Links? = Links(),
            val location: String? = "",
            val name: String? = "",
            @SerialName("portfolio_url")
            val portfolioUrl: String? = "",
            @SerialName("profile_image")
            val profileImage: ProfileImage? = ProfileImage(),
            val social: Social? = Social(),
            @SerialName("total_collections")
            val totalCollections: Int? = 0,
            @SerialName("total_likes")
            val totalLikes: Int? = 0,
            @SerialName("total_photos")
            val totalPhotos: Int? = 0,
            @SerialName("twitter_username")
            val twitterUsername: String? = "",
            @SerialName("updated_at")
            val updatedAt: String? = "",
            val username: String? = ""
        ) {
            @Serializable
            data class Links(
                val followers: String? = "",
                val following: String? = "",
                val html: String? = "",
                val likes: String? = "",
                val photos: String? = "",
                val portfolio: String? = "",
                val self: String? = ""
            )

            @Serializable
            data class ProfileImage(
                val large: String? = "",
                val medium: String? = "",
                val small: String? = ""
            )

            @Serializable
            data class Social(
                @SerialName("instagram_username")
                val instagramUsername: String? = "",
                @SerialName("paypal_email")
                val paypalEmail: String? = "",
                @SerialName("portfolio_url")
                val portfolioUrl: String? = "",
                @SerialName("twitter_username")
                val twitterUsername: String? = ""
            )
        }
    }

    @Serializable
    class TopicSubmissions

    @Serializable
    data class Urls(
        val full: String? = "",
        val raw: String? = "",
        val regular: String? = "",
        val small: String? = "",
        @SerialName("small_s3")
        val smallS3: String? = "",
        val thumb: String? = ""
    )

    @Serializable
    data class User(
        @SerialName("accepted_tos")
        val acceptedTos: Boolean? = false,
        val bio: String? = "",
        @SerialName("first_name")
        val firstName: String? = "",
        @SerialName("for_hire")
        val forHire: Boolean? = false,
        val id: String? = "",
        @SerialName("instagram_username")
        val instagramUsername: String? = "",
        @SerialName("last_name")
        val lastName: String? = "",
        val links: Links? = Links(),
        val location: String? = "",
        val name: String? = "",
        @SerialName("portfolio_url")
        val portfolioUrl: String? = "",
        @SerialName("profile_image")
        val profileImage: ProfileImage? = ProfileImage(),
        val social: Social? = Social(),
        @SerialName("total_collections")
        val totalCollections: Int? = 0,
        @SerialName("total_likes")
        val totalLikes: Int? = 0,
        @SerialName("total_photos")
        val totalPhotos: Int? = 0,
        @SerialName("twitter_username")
        val twitterUsername: String? = "",
        @SerialName("updated_at")
        val updatedAt: String? = "",
        val username: String? = ""
    ) {
        @Serializable
        data class Links(
            val followers: String? = "",
            val following: String? = "",
            val html: String? = "",
            val likes: String? = "",
            val photos: String? = "",
            val portfolio: String? = "",
            val self: String? = ""
        )

        @Serializable
        data class ProfileImage(
            val large: String? = "",
            val medium: String? = "",
            val small: String? = ""
        )

        @Serializable
        data class Social(
            @SerialName("instagram_username")
            val instagramUsername: String? = "",
            @SerialName("paypal_email")
            val paypalEmail: String? = "",
            @SerialName("portfolio_url")
            val portfolioUrl: String? = "",
            @SerialName("twitter_username")
            val twitterUsername: String? = ""
        )
    }
}