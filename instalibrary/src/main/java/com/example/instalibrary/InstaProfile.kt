package com.example.instalibrary

import android.content.Context
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley

private var requestQueue: RequestQueue? = null

class InstaProfile {
    companion object {
        fun getInfo(
            context: Context,
            userName: String,
            instaProfileListener: InstaProfileListener
        ) {

            requestQueue = Volley.newRequestQueue(context)
            val url = "https://www.instagram.com/$userName/?__a=1"

            val request =
                JsonObjectRequest(Request.Method.GET, url, null, Response.Listener { response ->
                    val obj = response.getJSONObject("graphql").getJSONObject("user")

                    instaProfileListener.onSuccess(
                        obj.getString("full_name"),
                        obj.getJSONObject("edge_followed_by").getInt("count"),
                        obj.getJSONObject("edge_follow").getInt("count"),
                        obj.getString("profile_pic_url_hd"),
                        obj.getString("biography"),
                        obj.getString("external_url"),
                        obj.getBoolean("is_private"),
                        obj.getBoolean("is_verified"),
                        obj.getJSONObject("edge_owner_to_timeline_media").getInt("count"),
                        obj.getJSONObject("edge_felix_video_timeline").getInt("count"),
                        obj.getInt("highlight_reel_count")
                    )

                }, Response.ErrorListener { error ->

                    instaProfileListener.onError(error.toString())
                    error.printStackTrace()
                })

            requestQueue?.add(request)
        }
    }
}