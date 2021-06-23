package com.rsschool.quiz.viewmodel

import com.rsschool.quiz.model.exception.QuestionException
import com.rsschool.quiz.model.entity.Answer
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
        answers = Answer()
    }

    fun currentQuestion(): Question = repository.getAll()[currentQuestion]

    fun nextQuestion() {
       if (!isLast()) {
           ++currentQuestion
       } else throw QuestionException("This was last question")
    }

    fun prevQuestion() {
        if (!isFirst()) {
            --currentQuestion
        } else throw QuestionException("This was first question")
    }

    fun saveAnswer(id: Int, answer: String) {
        //TODO Relize save method
    }

    fun questionSize(): Int = repository.getAll().size

    private fun isFirst(): Boolean {
        return (currentQuestion == 0)
    }

    private fun isLast(): Boolean {
        return (currentQuestion == (questionSize() - 1))
    }
}