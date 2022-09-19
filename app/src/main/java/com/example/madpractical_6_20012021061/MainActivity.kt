package com.example.madpractical_6_20012021061

import android.media.session.MediaController
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.VideoView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mediaController = MediaController(this)
        val uri: Uri = Uri.parse("android.resource://" + packageName + "/" + R.raw.thestoryoflight)
        val myvideoview = findViewById<VideoView>(R.id.video_view)
        myvideoview.setMediaController(mediaController)
        mediaController.se
        myvideoview
        val button = findViewById<floatingActionButton>(R.id.buton)
    }
}