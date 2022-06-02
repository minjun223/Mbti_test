package com.example.mbti_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import kotlin.reflect.KClass

class Tf_2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tf2)

        val Tf2_1 : CheckBox = findViewById(R.id.Tf2_1)
        Tf2_1.setOnClickListener{
            val intent = Intent(this, Jp_3Activity::class.java)
            intent.putExtra("T_2","t")
        }
        val Tf2_2 : CheckBox = findViewById(R.id.Tf2_2)
        Tf2_2.setOnClickListener{
            val intent = Intent(this, Jp_3Activity::class.java)
            intent.putExtra("f_2","f")
        }
        val button9 : Button = findViewById(R.id.button8)
        button9.setOnClickListener{
            val intent = Intent(this, Tf_3Activity::class.java)
            startActivity(intent)
        }
    }
    private fun Intent(activity: MainActivity, kClass: KClass<Tf_3Activity>): Intent? {
        TODO("Not yet implemented")
    }
}