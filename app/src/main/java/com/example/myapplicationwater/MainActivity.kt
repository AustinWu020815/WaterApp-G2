package com.example.myapplicationwater

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import java.util.Timer
import java.util.TimerTask

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tv_reminder = findViewById<TextView>(R.id.tv_reminder)
        intent?.extras?.let {
            tv_reminder.text = "提醒：" + it.getString("reminder")
        }
        findViewById<Button>(R.id.btn_start).setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivityForResult(intent, 2)
        }
    }
}