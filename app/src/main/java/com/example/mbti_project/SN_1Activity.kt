package com.example.mbti_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import kotlin.reflect.KClass

class SN_1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sn1)
        val Sn1_1 : CheckBox = findViewById(R.id.Sn1_1)
        Sn1_1.setOnClickListener{
            val intent = Intent(this, Jp_3Activity::class.java)
            intent.putExtra("s_1","s")
        }
        val Sn1_2 : CheckBox = findViewById(R.id.Sn1_2)
        Sn1_2.setOnClickListener{
            val intent = Intent(this, Jp_3Activity::class.java)
            intent.putExtra("n_1","n")
        }
        val button5 : Button = findViewById(R.id.button4)
        button5.setOnClickListener{
            val intent = Intent(this, Sn_2Activity::class.java)
            startActivity(intent)
        }
    }
    private fun Intent(activity: MainActivity, kClass: KClass<Sn_2Activity>): Intent? {
        TODO("Not yet implemented")
    }
}