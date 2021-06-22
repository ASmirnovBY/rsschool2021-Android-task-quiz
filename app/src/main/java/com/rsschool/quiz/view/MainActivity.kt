package com.rsschool.quiz.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rsschool.quiz.R
import com.rsschool.quiz.view.question.QuestionFragment

class MainActivity : AppCompatActivity() {
    private val START_QUESTION_WITH_FIRST_QUESTION = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loadFragment()
    }

    private fun loadFragment() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, QuestionFragment.getFragment())
            .commit()
    }

    private fun loadFragmentWithId(id: Int) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, QuestionFragment.getFragment())
            .commit()
    }

}