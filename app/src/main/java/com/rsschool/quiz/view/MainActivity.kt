package com.rsschool.quiz.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import com.rsschool.quiz.R
import com.rsschool.quiz.model.repository.QuestionRepository
import com.rsschool.quiz.model.repository.SingltonQuestionRepository

class MainActivity : AppCompatActivity(), QuestionFragment.QuestionAction {

    private var id = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun loadFragmentWithId(id: Int) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, QuestionFragment.createInstance(id))
            .commit()
    }

    override fun nextQuestion() {
        ++id
        loadFragmentWithId(id)
    }

    override fun prevQuestion() {
        --id
        loadFragmentWithId(id)
    }
}