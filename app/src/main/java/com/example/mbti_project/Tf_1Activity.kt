package com.example.mbti_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import kotlin.reflect.KClass

class Tf_1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tf1)

        val Tf1_1: CheckBox = findViewById(R.id.Tf1_1);
        Tf1_1.setOnClickListener{
            val intent = Intent(this, Jp_3Activity::class.java)
            intent.putExtra("T_1","t")
        }
        val Tf1_2: CheckBox = findViewById(R.id.Tf1_2);
        Tf1_2.setOnClickListener{
            val intent = Intent(this, Jp_3Activity::class.java)
            intent.putExtra("f_1","f")
        }

        val button8 : Button = findViewById(R.id.button7)
        button8.setOnClickListener{
            val intent = Intent(this, Tf_2Activity::class.java)
            startActivity(intent)
        }
    }
    private fun Intent(activity: MainActivity, kClass: KClass<Tf_2Activity>): Intent? {
        TODO("Not yet implemented")
    }
}