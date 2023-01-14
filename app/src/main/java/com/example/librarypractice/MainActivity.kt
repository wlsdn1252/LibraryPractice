package com.example.librarypractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
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

        // 인터넷에 있는 이미지(https:)로 시작하는 이미지주소를 사용
        // AndroidManifest에서 인터넷 권한 설정해야함
        // glide 라이브러리 활용
        // 가끔 http:로 시작하는 url을 사용해야 함 그럴땐  AndroidManifest -> application태그 안에 android:usesCleartextTraffic="true"추가 하기
        Glide.with(this).load("https://i0.wp.com/breakingcube.com/wp-content/uploads/2020/10/%EB%AC%B4%EB%A3%8C-" +
                "%EC%9D%B4%EB%AF%B8%EC%A7%80-%EB%B8%94%EB%A1%9C%EA%B7%B8-%ED%8F%AC%EC%8A%A4%ED%8C%85-%EC%8D%B8%EB%84%A4%EC%9D%BC-1." +
                "png?resize=1024%2C576&ssl=1").into(lectureImg1)

    }
}