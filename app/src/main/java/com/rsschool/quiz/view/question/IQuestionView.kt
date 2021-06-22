package com.rsschool.quiz.view.question

import com.rsschool.quiz.model.entity.Question

interface IQuestionView {
    fun renderingQuestion(question: Question)
    fun nextQuestion(question: Question)
    fun prevQuestion(question: Question)
}