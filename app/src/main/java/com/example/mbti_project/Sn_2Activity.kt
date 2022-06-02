package com.example.mbti_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox

class Sn_2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sn2)
        val Sn2_1 : CheckBox = findViewById(R.id.Sn2_1)
        Sn2_1.setOnClickListener{
            val intent = Intent(this, Jp_3Activity::class.java)
            intent.putExtra("s_1","s")
        }

        val Sn2_2 : CheckBox = findViewById(R.id.Sn2_2)
        Sn2_2.setOnClickListener{
            val intent = Intent(this, Jp_3Activity::class.java)
            intent.putExtra("n_1","n")
        }
        val button6 : Button = findViewById(R.id.button5)
        button6.setOnClickListener{
            val intent = Intent(this, Sn_3Activity::class.java)
            startActivity(intent)
        }
    }
}