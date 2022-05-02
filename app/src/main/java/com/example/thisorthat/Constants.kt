package com.example.thisorthat

object Constants{

    fun getQuestions():ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            id = 1,
            thisoption = "Fly in a rocket",
            thatoption = "Journey to the cente of the earth",
            thisoptionpercent = 65,
            thatoptionpercent = 35,
            drinks = 2,
            total = 171600
            )

        val que2 = Question(
            id = 2,
            thisoption = "Live in Antartica",
            thatoption = "Live in the Sahara",
            thisoptionpercent = 62,
            thatoptionpercent = 38,
            drinks = 2,
            total = 179500
        )

        val que3 = Question(
            id = 3,
            thisoption = "Never shower again",
            thatoption = "Never talk to anyone again",
            thisoptionpercent = 55,
            thatoptionpercent = 45,
            drinks = 1,
            total = 167200
        )

        questionsList.add(que1)
        questionsList.add(que2)
        questionsList.add(que3)
        return questionsList
    }
}

//val id: Int,
//val thisoption: String,
//val thatoption: String,id:1, thisoption:"Take a trip to space", thatoption:"Go to the depths of the ocean",
//        thisoptionpercent:65,thisoptionpercent:35,drinks:23,total:12
//val thisoptionpercent: String,
//val thatoptionpercent: String,
//val drinks: Int
