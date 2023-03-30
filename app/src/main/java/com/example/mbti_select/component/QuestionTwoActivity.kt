package com.example.mbti_select.component

import android.content.Intent
import android.os.Bundle
import android.util.Log
import com.example.mbti_select.R
import com.example.mbti_select.base.BaseActivity
import com.example.mbti_select.databinding.ActivityQuestionTwoBinding

class QuestionTwoActivity :
    BaseActivity<ActivityQuestionTwoBinding>(R.layout.activity_question_two) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question_two)
    }

    private var questionOne = ""
    override fun init() {
        questionOne = intent.getStringExtra("question-ONE").toString()
        Log.d("TAAAG", questionOne)
        onClick()
    }

    private fun onClick() {
        val questionThreeIntent = Intent(this, QuestionThreeActivity::class.java)
        val resultIntent = Intent(this, ResultActivity::class.java)
        with(binding) {
            yesBtn.setOnClickListener {
                if(questionOne == "YES"){
                    resultIntent.putExtra("mbti", arrayOf("ENTJ", "ENFP", "걍 나가서 놀아임마"))
                    startActivity(resultIntent)
                }else{
                    questionThreeIntent.putExtra("question", "")
                    questionThreeIntent.putExtra("YesText", "")
                    questionThreeIntent.putExtra("NoText", "")
                }
            }
            noBtn.setOnClickListener {
                if (questionOne == "YES") {
                    questionThreeIntent.putExtra("question", "")
                    questionThreeIntent.putExtra("YesText", "")
                    questionThreeIntent.putExtra("NoText", "")
                    startActivity(questionThreeIntent)
                } else {
                    questionThreeIntent.putExtra("question", "")
                    questionThreeIntent.putExtra("YesText", "")
                    questionThreeIntent.putExtra("NoText", "")
                    startActivity(questionThreeIntent)
                }
            }
        }
    }
}