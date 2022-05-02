package com.example.thisorthat

import android.os.Build
import android.os.Bundle
import android.os.CountDownTimer
import android.util.Half.toFloat
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.ProgressBar
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import java.util.*


class TOTQuestionActivity : AppCompatActivity(), View.OnClickListener{

    private var mCurrentPosition: Int = 1
    private var mQuestionList: ArrayList<Question>? = null
    private var mSelectedOption: Int = 0






    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_totquestion)




        mQuestionList = Constants.getQuestions()
        setQuestion()
        var thisoption = findViewById<TextView>(R.id.this_option)
        var thatoption = findViewById<TextView>(R.id.that_option)
        thisoption.setOnClickListener(this)
        thatoption.setOnClickListener(this)


    }

    private fun setQuestion(){



        mCurrentPosition = 1
        val question = mQuestionList!![mCurrentPosition - 1]

        var progressbar = findViewById<ProgressBar>(R.id.progressbar)
        var progresstext = findViewById<TextView>(R.id.progresstext)
        progressbar.progress = mCurrentPosition
        progresstext.text = "$mCurrentPosition" + "/" + progressbar.max

        var thisoption = findViewById<TextView>(R.id.this_option)
        var thatoption = findViewById<TextView>(R.id.that_option)

        thisoption.text = question.thisoption
        thatoption.text = question.thatoption
        var timer = findViewById<TextView>(R.id.timer)
        object : CountDownTimer(11000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                timer.setText("" + millisUntilFinished / 1000)
            }

            override fun onFinish() {
                timer.setText("Times Up!")
            }
        }.start()

    }


    private fun answerReveal(v: View?){


    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.this_option, R.id.that_option -> {

                var thisoption = findViewById<TextView>(R.id.this_option)
                var thatoption = findViewById<TextView>(R.id.that_option)

                val question = mQuestionList!![mCurrentPosition - 1]
                thisoption.text = "${question.thisoptionpercent}"
                thatoption.text = "${question.thatoptionpercent}"
                val weightthis = question.thisoptionpercent.toFloat()
                val weightthat = question.thatoptionpercent.toFloat()
                val thisparam = LinearLayout.LayoutParams(
                    0,
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    weightthis
                )

                val thatparam = LinearLayout.LayoutParams(
                    0,
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    weightthat
                )

                thisparam.setMargins(55,0,25,0)
                thatparam.setMargins(0,0,55,0)
                thisoption.layoutParams = thisparam
                thatoption.layoutParams = thatparam
                Log.i("Weight", "${thisoption.layoutParams.width}")

                Log.i("Weight", "${thisoption.layoutParams.width}")



            }
//
        }

    }






}