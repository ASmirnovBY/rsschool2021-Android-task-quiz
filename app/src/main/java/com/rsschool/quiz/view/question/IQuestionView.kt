package com.rsschool.quiz.view.question

import com.rsschool.quiz.model.entity.Question

interface IQuestionView {
    fun renderingQuestion()
    fun nextQuestion()
    fun prevQuestion()
    fun printError(message: String?)
    fun bindingAnswers(answers: Array<String>?)
    fun buildAnswer()
}