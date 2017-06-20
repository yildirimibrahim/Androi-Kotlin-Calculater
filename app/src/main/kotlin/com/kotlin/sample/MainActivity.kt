package com.kotlin.sample

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val result = findViewById(R.id.tvSonuc) as TextView

        val button_add = findViewById(R.id.btnToplama) as Button
        val button_minus = findViewById(R.id.btnCikarma) as Button
        val button_multiply = findViewById(R.id.btnCarpma) as Button
        val button_divide = findViewById(R.id.btnBolme) as Button

        button_add.setOnClickListener(View.OnClickListener {

            view ->
            if (getNum1() != 0 && getNum2() != 0)
                result.text = (getNum1() + getNum2()).toString() + " Toplama Sonucu "
            else
                myToast(this);
        })

        button_minus.setOnClickListener(View.OnClickListener {

            view ->
            if (getNum1() != 0 && getNum2() != 0)
                result.text = (getNum1() - getNum2()).toString() + " Çıkarma Sonucu "
            else
                myToast(this);
        })

        button_multiply.setOnClickListener(View.OnClickListener {

            view ->
            if (getNum1() != 0 && getNum2() != 0)
                result.text = (getNum1() * getNum2()).toString() + " Çarpma Sonucu "
            else
                myToast(this);
        })

        button_divide.setOnClickListener(View.OnClickListener {

            view ->
            if (getNum1() != 0 && getNum2() != 0)
                result.text = (getNum1() / getNum2()).toString() + " Bölme Sonucu "
            else
                myToast(this);

        })
    }

    fun getNum1(): Int {
        val input_num1 = findViewById(R.id.etValue1) as EditText
        if (!input_num1.text.isNullOrEmpty()) {
            return Integer.parseInt(input_num1.text.toString())
        } else
            return 0
    }

    fun getNum2(): Int {
        val input_num2 = findViewById(R.id.etValue2) as EditText
        if (!input_num2.text.isNullOrEmpty()) {
            return Integer.parseInt(input_num2.text.toString())
        } else
            return 0
    }

    fun Context.toast(message: CharSequence) = Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    fun myToast(context: Context) {
        context.toast("Bütün alanları doldurunuz..")
    }
}
