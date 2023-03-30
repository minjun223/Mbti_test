package com.example.mbti_select.component

import android.content.Intent
import com.example.mbti_select.R
import com.example.mbti_select.base.BaseActivity
import com.example.mbti_select.databinding.ActivityStartBinding

class StartActivity : BaseActivity<ActivityStartBinding>(R.layout.activity_start) {
    override fun init() {
        binding.goMain.setOnClickListener {
            startActivity(Intent(this, QuestionOneActivity::class.java))
        }
    }
}