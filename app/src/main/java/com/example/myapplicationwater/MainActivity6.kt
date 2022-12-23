package com.example.myapplicationwater

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)


        val ed_info = findViewById<EditText>(R.id.ed_info)

        findViewById<Button>(R.id.btn_back4).setOnClickListener{
            val intent = Intent(this, MainActivity2::class.java)
            startActivityForResult(intent, 14)
        }
        findViewById<Button>(R.id.btn_set).setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("reminder", ed_info.text.toString())
            startActivityForResult(intent,15)
        }
            }



}

