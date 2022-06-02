package com.example.mbti_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import kotlin.reflect.KClass

class Jp_1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jp1)
        val Jp1_1 : CheckBox = findViewById(R.id.Jp1_1)
        Jp1_1.setOnClickListener{
            val intent = Intent(this, Jp_3Activity::class.java)
            intent.putExtra("j_1","j")
        }
        val Jp1_2 : CheckBox = findViewById(R.id.Jp1_2)
        Jp1_2.setOnClickListener{
            val intent = Intent(this, Jp_3Activity::class.java)
            intent.putExtra("p_1","p")
        }
        val button11 : Button = findViewById(R.id.button10)
        button11.setOnClickListener{
            val intent = Intent(this, Jp_2Activity::class.java)
            startActivity(intent)
        }
    }
    private fun Intent(activity: MainActivity, kClass: KClass<Jp_2Activity>): Intent? {
        TODO("Not yet implemented")
    }
}