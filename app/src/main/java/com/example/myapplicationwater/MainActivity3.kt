package com.example.myapplicationwater

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        findViewById<Button>(R.id.btn_back1).setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivityForResult(intent, 11)
        }

        val ed_name = findViewById<EditText>(R.id.ed_name)
        val ed_height = findViewById<EditText>(R.id.ed_height)
        val ed_weight = findViewById<EditText>(R.id.ed_weight)
        val btn_enter = findViewById<Button>(R.id.btn_enter)
        var tv_amount = findViewById<TextView>(R.id.tv_amount)
        var tv_id = findViewById<TextView>(R.id.tv_id)
        btn_enter.setOnClickListener {
            var w = ed_weight.text.toString().toInt()
            var h = (ed_height.text.toString().toInt() * 0.01)*(ed_height.text.toString().toInt() * 0.01)
            var waterAmount = ed_weight.text.toString().toInt() * 30
            var bmi = w/h
            tv_id.text = "姓名： " + ed_name.text +"\n"+ "身高： " + ed_height.text +"cm\t\t"+ "體重： " + ed_weight.text +"kg"+"\n" + "BMI： " + bmi.toInt()

            ed_name.text = null
            ed_height.text = null
            ed_weight.text = null
            tv_amount.text = waterAmount.toString() + " ml"
            //ed_weight.text.toString().toInt()/((ed_height.text.toString().toInt())*(ed_height.text.toString().toInt()))
        }
    }
}