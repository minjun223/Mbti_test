package com.example.mbti_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox

class Ei_3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ei3)
        val Ei3_1 : CheckBox = findViewById(R.id.Ei3_1)
        Ei3_1.setOnClickListener{
            val intent = Intent(this, Jp_3Activity::class.java)
            intent.putExtra("e_3","e")
        }
        val Ei3_2 : CheckBox = findViewById(R.id.Ei3_2)
        Ei3_2.setOnClickListener{
            val intent = Intent(this, Jp_3Activity::class.java)
            intent.putExtra("i_3","i")
        }
        val button4 : Button = findViewById(R.id.button3)
        button4.setOnClickListener{
            val intent = Intent(this, SN_1Activity::class.java)
            startActivity(intent)
        }
    }
}
