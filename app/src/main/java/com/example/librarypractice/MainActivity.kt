package com.example.librarypractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        profileImg.setOnClickListener {
            // 프로필 크게 보는 액티비티로 이동
            val myIntent = Intent(this,ViewProfilePhotoActivity :: class.java)
            startActivity(myIntent)
        }
    }
}