package com.example.mbti_select.component

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.ActivityCompat
import com.example.mbti_select.R
import com.example.mbti_select.base.BaseActivity
import com.example.mbti_select.databinding.ActivityQuestionOneBinding

class QuestionOneActivity : BaseActivity<ActivityQuestionOneBinding>(R.layout.activity_question_one) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question_one)
    }
    override fun init(){
        onClick()
    }
    private fun onClick(){
        val intent = Intent(this, QuestionTwoActivity::class.java)
        with(binding) {
            yesBtn.setOnClickListener {
                intent.putExtra("question-ONE", "YES")
                startActivity(intent)
            }
            noBtn.setOnClickListener {
                intent.putExtra("question-ONE", "NO")
                startActivity(intent)
            }
        }
    }

}