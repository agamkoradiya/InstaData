package com.example.instalibrary

interface InstaProfileListener {

    fun onSuccess(
        full_name: String?,
        followers: Int?,
        following: Int?,
        profile_pic_url_hd: String?,
        biography: String?,
        external_url: String?,
        is_private: Boolean?,
        is_verified: Boolean?,
        total_media_timeline: Int?,
        total_video_timeline: Int?,
        highlight_count: Int?
    )

    fun onError(error: String?)

}