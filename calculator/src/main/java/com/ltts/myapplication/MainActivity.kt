package com.ltts.myapplication

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private var etn1: EditText? = null
    private var etn2: EditText? = null
    private var tvResult: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etn1 = findViewById<View>(R.id.etn1) as EditText
        etn2 = findViewById<View>(R.id.etn2) as EditText
        tvResult = findViewById<View>(R.id.tvResult) as TextView
    }

    fun btnsum(view: View?) {
        val n1 = etn1!!.text.toString().toInt()
        val n2 = etn2!!.text.toString().toInt()
        val sum = n1 + n2
        tvResult!!.text = sum.toString()
    }

    fun btnsub(view: View?) {
        val n1 = etn1!!.text.toString().toInt()
        val n2 = etn2!!.text.toString().toInt()
        val sum = n1 - n2
        tvResult!!.text = sum.toString()
    }

    fun btnmulti(view: View?) {
        val n1 = etn1!!.text.toString().toInt()
        val n2 = etn2!!.text.toString().toInt()
        val sum = n1 * n2
        tvResult!!.text = sum.toString()
    }

    fun btndiv(view: View?) {
        val n1 = etn1!!.text.toString().toInt()
        val n2 = etn2!!.text.toString().toInt()
        val sum = n1 / n2
        tvResult!!.text = sum.toString()
    }
}