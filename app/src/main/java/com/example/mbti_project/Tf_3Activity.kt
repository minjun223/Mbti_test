package com.example.mbti_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import kotlin.reflect.KClass

class Tf_3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tf3)

        val Tf3_1 : CheckBox = findViewById(R.id.Tf3_1)
        Tf3_1.setOnClickListener{
            val intent = Intent(this, Jp_3Activity::class.java)
            intent.putExtra("T_3","t")
        }
        val Tf3_2 : CheckBox = findViewById(R.id.Tf3_2)
        Tf3_2.setOnClickListener{
            val intent = Intent(this, Jp_3Activity::class.java)
            intent.putExtra("f_3","f")
        }
        val button10 : Button = findViewById(R.id.button9)
        button10.setOnClickListener{
            val intent = Intent(this, Jp_1Activity::class.java)
            startActivity(intent)
        }
    }
    private fun Intent(activity: MainActivity, kClass: KClass<Jp_1Activity>): Intent? {
        TODO("Not yet implemented")
    }
}