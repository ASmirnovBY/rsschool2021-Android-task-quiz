package com.rsschool.quiz.repository

import com.rsschool.quiz.model.entity.Question
import java.lang.UnsupportedOperationException

class SingltonQuestionRepository : QuestionRepository {

    private var questions: List<Question> = initialQuestion()

    override fun add(t: Question) {
        TODO("Not yet")
        throw UnsupportedOperationException("Not yet")
    }

    override fun delete(t: Question) {
        TODO("Not yet implemented")
        throw UnsupportedOperationException("Not yet")
    }

    override fun delete(id: Int) {
        TODO("Not yet implemented")
        throw UnsupportedOperationException("Not yet")
    }

    override fun getAll(): List<Question> {
        return questions
    }

    override fun findById(id: Int): Question {
        return questions[id - 1]
    }

    private fun initialQuestion(): List<Question> {
        questions = listOf(
            Question(1, "Столица Беларуси?",
                arrayOf("Москва", "Минск", "Париж", "Берлин"),
            "Минск"),
            Question(2, "В каком году началась Великая Отечественная война?",
                 arrayOf("1940", "1942", "1941", "1939"),
            "1941"),
            Question(3, "Кто написал произведение Война и Мир?",
                 arrayOf("Пушкин", "Толстой", "Смирнов", "Достоевский"),
            "Толстой"),
            Question(4, "Какой модификатор доступа используется для доступа из " +
                    "любога класса в Java?",
                arrayOf("public", "private ", "protected", "default"),
                "public"),
            Question(5, "Что из перечисленного является виски?",
                arrayOf("Jim Beam", "Bacardi", "Olmeca", "Absolut"),
                "public")
        )
        return questions
    }
}