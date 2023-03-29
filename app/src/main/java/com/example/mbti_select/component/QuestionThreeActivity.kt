package com.example.mbti_select.component

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mbti_select.R
import com.example.mbti_select.base.BaseActivity
import com.example.mbti_select.databinding.ActivityQuestionThreeBinding

class QuestionThreeActivity :  BaseActivity<ActivityQuestionThreeBinding>(R.layout.activity_question_three) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question_three)
    }

    private fun onClick(question: String) {
        val resultIntent = Intent(this, ResultActivity::class.java)
        val questionFourIntent = Intent(this, QuestionFourActivity::class.java)
        with(binding) {
            yesBtn.setOnClickListener {

            }
            noBtn.setOnClickListener {

            }
        }
    }

    override fun init() {
        TODO("Not yet implemented")
    }
}