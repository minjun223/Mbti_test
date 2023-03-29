package com.example.mbti_select.component

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mbti_select.R
import com.example.mbti_select.base.BaseActivity
import com.example.mbti_select.databinding.ActivityQuestionFourBinding

class QuestionFourActivity :  BaseActivity<ActivityQuestionFourBinding>(R.layout.activity_question_four){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question_four)
    }
    override fun init() {
        with(binding) {
            question.text = intent.getStringExtra("question")
            yesBtn.text = intent.getStringExtra("YesText")
            noBtn.text = intent.getStringExtra("NoText")
        }
        onClick(intent.getStringExtra("question")!!)
    }
    private fun onClick(question: String) {
        val resultIntent = Intent(this, ResultActivity::class.java)
        with(binding) {
            yesBtn.setOnClickListener {

            }
            noBtn.setOnClickListener {

            }
        }
    }
}