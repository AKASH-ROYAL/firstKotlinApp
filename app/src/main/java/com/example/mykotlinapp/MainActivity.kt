package com.example.mykotlinapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() , View.OnClickListener{

    lateinit var btnAdd:Button
    lateinit var btnSub:Button
    lateinit var btnMul:Button
    lateinit var btnDiv:Button
    lateinit var etA:EditText
    lateinit var etB:EditText
    lateinit var resultTV: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }

        btnAdd= findViewById(R.id.button_add)
        btnSub= findViewById(R.id.button_diff)
        btnMul= findViewById(R.id.button_mul)
        btnDiv= findViewById(R.id.button_div)
        etA= findViewById(R.id.et_a)
        etB= findViewById(R.id.et_b)
        resultTV= findViewById(R.id.result_tv)
        btnAdd.setOnClickListener(this)
        btnSub.setOnClickListener(this)
        btnMul.setOnClickListener(this)
        btnDiv.setOnClickListener(this)


    }

    override fun onClick(v: View?) {
        var a = etA.text.toString().toDouble();
        var b = etB.text.toString().toDouble();
        var  result=0.0;
        when(v?.id){
            R.id.button_add->{result=a+b}
            R.id.button_diff->{result=a-b}
            R.id.button_mul->{result=a*b}
            R.id.button_div->{result=a/b}

        }

        resultTV.text="Result is $result";

    }
}
