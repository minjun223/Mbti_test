package com.example.mbti_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox

class Ei_2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ei2)
        val Ei2_1: CheckBox = findViewById(R.id.Ei2_1)
        Ei2_1.setOnClickListener{
            val intent = Intent(this, Jp_3Activity::class.java)
            intent.putExtra("e_2","e")
        }
        val Ei2_2: CheckBox = findViewById(R.id.Ei2_2)
        Ei2_2.setOnClickListener{
            val intent = Intent(this, Jp_3Activity::class.java)
            intent.putExtra("i_2","i")
        }
        val button3 : Button = findViewById(R.id.button2)
        button3.setOnClickListener{
            val intent = Intent(this, Ei_3::class.java)
            startActivity(intent)
        }
    }
}