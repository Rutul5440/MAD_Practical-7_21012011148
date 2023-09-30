package com.example.mad_practical_7_21012011148

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val activityChange: FloatingActionButton = findViewById(R.id.activitychange)
        activityChange.setOnClickListener {
            Intent(this@MainActivity, YoutubeActivity::class.java).also { startActivity(it) }
        }
        val myVideoView = findViewById<VideoView>(R.id.videoView)
        val mediaController = MediaController(this)
        val uri:Uri = Uri.parse("android.resource://" + packageName + "/" + R.raw.thestoryoflight)
        myVideoView.setMediaController(mediaController)
        mediaController.setAnchorView(myVideoView)
        myVideoView.setVideoURI(uri)
        myVideoView.requestFocus()
        myVideoView.start()

        val button = findViewById<FloatingActionButton>(R.id.activitychange)
        button.setOnClickListener {
            Intent(this,YoutubeActivity::class.java).apply { startActivity(this) }
        }

    }

}