package com.example.mbti_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import kotlin.reflect.KClass

class Ei_Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ei)
        val Ei_1 : CheckBox = findViewById(R.id.Ei1_1)
        Ei_1.setOnClickListener{
            val intent = Intent(this, Jp_3Activity::class.java)
            intent.putExtra("e_1","e")
        }

        val Ei_2 : CheckBox = findViewById(R.id.Ei1_2)
        Ei_2.setOnClickListener{
            val intent = Intent(this, Jp_3Activity::class.java)
            intent.putExtra("i_1","i")
        }

        val button2 : Button = findViewById(R.id.button1)
        button2.setOnClickListener{
            val intent = Intent(this, Ei_2Activity::class.java)
            startActivity(intent)
        }
    }
    private fun Intent(activity: MainActivity, kClass: KClass<Ei_2Activity>): Intent? {
        TODO("1")
    }


}
