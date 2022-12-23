package com.example.myapplicationwater

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        findViewById<Button>(R.id.btn_back3).setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivityForResult(intent, 13)
        }
        findViewById<Button>(R.id.btn_back4).setOnClickListener {
            val uri = Uri.parse("https://www.youtube.com/results?search_query=%E5%96%9D%E6%B0%B4%E7%9F%A5%E8%AD%98")
            val i = Intent(Intent.ACTION_VIEW, uri)
            startActivity(i)
        }
    }
}