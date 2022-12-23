package com.example.myapplicationwater

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        findViewById<Button>(R.id.btn_back2).setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivityForResult(intent, 12)
        }
    }
}
//不使用此頁