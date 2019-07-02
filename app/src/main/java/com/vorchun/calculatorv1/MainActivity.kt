package com.vorchun.calculatorv1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var mFirstNumber = first_number.text
        var mSecondNumber = second_number.text

        btn_sum.setOnClickListener {
            val mResult = mFirstNumber.toString()?.toLong() + mSecondNumber.toString()?.toLong()
        }
        btn_sub.setOnClickListener {
            val mResult = mFirstNumber.toString()?.toLong() - mSecondNumber.toString()?.toLong()
        }
        btn_div.setOnClickListener {
            val mResult = mFirstNumber.toString()?.toLong() / mSecondNumber.toString()?.toLong()
        }
        btn_multi.setOnClickListener {
            val mResult = mFirstNumber.toString()?.toLong() * mSecondNumber.toString()?.toLong()
        }
    }
}
