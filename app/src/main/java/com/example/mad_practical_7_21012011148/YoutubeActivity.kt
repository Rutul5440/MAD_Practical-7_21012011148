package com.example.mad_practical_7_21012011148

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import com.google.android.material.floatingactionbutton.FloatingActionButton
class YoutubeActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_youtube)

        val youtubeId = "5ipgyJCQpKdxAWpu"
        val youtubeWebView : WebView = findViewById(R.id.webView)
        val webSettings : WebSettings = youtubeWebView.settings
        webSettings.javaScriptEnabled = true
        webSettings.loadWithOverviewMode = true
        webSettings.useWideViewPort = true
        youtubeWebView.loadUrl("https://www.youtube.com/embed/$youtubeId")

        val changeActivity: FloatingActionButton = findViewById(R.id.changeactivity)
        changeActivity.setOnClickListener {
            val intent = Intent(this@YoutubeActivity, MainActivity::class.java)
            startActivity(intent)
        }
    }
}