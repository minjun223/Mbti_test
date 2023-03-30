package com.example.mbti_select.component

import com.example.mbti_select.R
import com.example.mbti_select.base.BaseActivity
import com.example.mbti_select.databinding.ActivityResultBinding
import java.util.*

class ResultActivity : BaseActivity<ActivityResultBinding>(R.layout.activity_result) {
    private lateinit var mbti: Array<String>
    override fun init() {
        mbti = intent.getStringArrayExtra("mbti")!!
        chooseMbti()
    }

    private fun chooseMbti() {
        val randomIndex = Random().nextInt(mbti.size)
        binding.mbtiName.text = mbti[randomIndex]
    }
}