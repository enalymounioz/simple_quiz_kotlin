package com.elenivoreos.simplequiz

object Constants {

    const val USER_NAME : String = "user_name"
    const val  TOTAL_QUESTIONS : String = "total_questions"
    const val  CORRECT_ANSWERS : String = "correct_answers"

    fun getQuestions(): ArrayList<Question> {

        val questionsList = ArrayList<Question>()

        val question1 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina", "Australia",
            "Armenia", "Austria",
            1
        )
        questionsList.add(question1)

        val question2 = Question(
            2, "What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "Greece", "Canada","Austria", "Australia",
            4

        )
        questionsList.add(question2)

        return questionsList




    }
}