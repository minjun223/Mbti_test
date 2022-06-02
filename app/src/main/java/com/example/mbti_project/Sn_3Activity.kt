package com.example.mbti_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import kotlin.reflect.KClass

class Sn_3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sn3)
        val Sn3_1 : CheckBox = findViewById(R.id.Sn3_1)
        Sn3_1.setOnClickListener{
            val intent = Intent(this, Jp_3Activity::class.java)
            intent.putExtra("s_1","s")
        }
        val Sn3_2 : CheckBox = findViewById(R.id.Sn3_2)
        Sn3_2.setOnClickListener{
            val intent = Intent(this, Jp_3Activity::class.java)
            intent.putExtra("n_1","n")
        }
        val button7 : Button = findViewById(R.id.button6)
        button7.setOnClickListener{
            val intent = Intent(this, Tf_1Activity::class.java)
            startActivity(intent)
        }
    }
    private fun Intent(activity: MainActivity, kClass: KClass<Tf_1Activity>): Intent? {
        TODO("Not yet implemented")
    }
}