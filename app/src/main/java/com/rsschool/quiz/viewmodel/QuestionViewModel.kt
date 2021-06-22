package com.rsschool.quiz.viewmodel

import com.rsschool.quiz.model.QuestionException
import com.rsschool.quiz.model.entity.Question
import com.rsschool.quiz.repository.QuestionRepository
import com.rsschool.quiz.repository.SingltonQuestionRepository

class QuestionViewModel {
    private var currentQuestion = 0
    private val repository: QuestionRepository
    private val answers: Answer

    init {
        /*Hard code, replace with Dagger2 and Inject in Constructor
        *Maybe need to create class Service (QuestionRepository)
        */
        repository = SingltonQuestionRepository()
    }

    fun nextQuestion(): Question {
       if (!isLast()) {
           ++currentQuestion
           return repository.getAll()[currentQuestion]
       } else throw QuestionException("This was last question")
    }

    fun prevQuestion(): Question {
        if (!isFirst()) {
            --currentQuestion
            return repository.getAll()[currentQuestion]
        } else throw QuestionException("This was first question")
    }

    fun saveAnswer(answer: String) {}

    fun questionSize(): Int = repository.getAll().size

    private fun isFirst(): Boolean {
        return (currentQuestion == 0)
    }

    private fun isLast(): Boolean {
        return (questionSize() == (currentQuestion - 1))
    }
}