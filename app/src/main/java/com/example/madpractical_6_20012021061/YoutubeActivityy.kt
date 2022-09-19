package com.example.madpractical_6_20012021061

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class YoutubeActivityy : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_youtube_activityy)
    val youtubeid =""
        val mywwebview = findViewById<webview>(R.id.web_view)
val setting= mywwebview.setting
    setting.use.wide }
}