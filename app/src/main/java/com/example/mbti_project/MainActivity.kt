package com.example.mbti_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.google.android.material.button.MaterialButtonToggleGroup
import kotlin.reflect.KClass

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button : Button = findViewById(R.id.Mbutton)
        button.setOnClickListener{
            val intent =Intent(this, Ei_Activity::class.java)
            startActivity(intent)
        }

    }
    private fun Intent(activity: MainActivity, kClass: KClass<Ei_Activity>): Intent? {
        TODO("Not yet implemented")
    }

}