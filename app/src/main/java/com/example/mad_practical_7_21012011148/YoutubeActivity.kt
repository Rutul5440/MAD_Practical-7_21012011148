package com.example.mad_practical_7_21012011148

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton

class YoutubeActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_youtube)

        val changeActivity: FloatingActionButton = findViewById(R.id.changeactivity)
        changeActivity.setOnClickListener {
            Intent(this@YoutubeActivity,MainActivity::class.java).also { startActivity(it) }
        }

    }

}