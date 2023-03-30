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
        val questionFourIntent = Intent(this, QuestionFourActivity::class.java)
        with(binding) {
            yesBtn.setOnClickListener {
                if (question.contains("")) {
                    resultIntent.putExtra("", arrayOf("", ""))
                    startActivity(resultIntent)
                } else {
                    resultIntent.putExtra("", arrayOf("", ""))
                    startActivity(resultIntent)
                }
            }
            noBtn.setOnClickListener {
                if (question.contains("")) {
                    questionFourIntent.putExtra("", "")
                    questionFourIntent.putExtra("", "")
                    questionFourIntent.putExtra("", "")
                    startActivity(questionFourIntent)
                }  else {
                    questionFourIntent.putExtra("", "")
                    questionFourIntent.putExtra("", "")
                    questionFourIntent.putExtra("", "치워주라 ㅋㅋ")
                    startActivity(questionFourIntent)
                }
            }
        }
    }

}