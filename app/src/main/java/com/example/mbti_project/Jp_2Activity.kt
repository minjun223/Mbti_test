package com.example.mbti_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import kotlin.reflect.KClass

class Jp_2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jp2)
        val Jp2_1 : CheckBox = findViewById(R.id.Jp2_1)
        Jp2_1.setOnClickListener{
            val intent = Intent(this, Jp_3Activity::class.java)
            intent.putExtra("j_2","j")
        }
        val Jp2_2 : CheckBox = findViewById(R.id.Jp2_2)
        Jp2_2.setOnClickListener{
            val intent = Intent(this, Jp_3Activity::class.java)
            intent.putExtra("p_2","p")
        }
        val button12 : Button = findViewById(R.id.button11)
        button12.setOnClickListener{
            val intent = Intent(this, Jp_3Activity::class.java)
            startActivity(intent)
        }
    }
    private fun Intent(activity: MainActivity, kClass: KClass<Jp_3Activity>): Intent? {
        TODO("Not yet implemented")
    }
}