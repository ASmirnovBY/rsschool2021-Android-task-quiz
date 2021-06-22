package com.rsschool.quiz.model.entity

import java.lang.IllegalArgumentException

class Answer {
    private val userAnswer: HashMap<Int, String> = hashMapOf()

    fun addAnswer(id: Int, answer: String) {
        userAnswer.put(id, answer)
    }

    fun getAnswer(id: Int): String? {
        if (!userAnswer.containsKey(id)) {
            throw IllegalArgumentException("No answer this id=${id}")
        }
        return userAnswer.get(id)
    }

    fun getAllAnswers(): Map<Int, String> {
        return userAnswer
    }

    fun getSize (): Int = userAnswer.size


}