package com.example.ca2


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.core.view.isVisible
import org.w3c.dom.Text

class question_2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question2)


        Toast.makeText(this,"Hello User",Toast.LENGTH_SHORT).show();

        val tsgrp=findViewById<RadioGroup>(R.id.rbgrp);
        val cb1=findViewById<CheckBox>(R.id.checkBox)

        cb1.setOnClickListener(){
            if (cb1.isChecked){
                Toast.makeText(this,"You checked  "+cb1.text,Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(this,"You unchecked  "+cb1.text,Toast.LENGTH_SHORT).show();
            }
        }

        val radioT=findViewById<RadioButton>(R.id.radio1);
        val radioS=findViewById<RadioButton>(R.id.radio2);

        radioT.setOnClickListener(){
            if (radioT.isChecked){
                Toast.makeText(this,"Selected button - "+radioT.text,Toast.LENGTH_SHORT).show();


            }
        }
        radioS.setOnClickListener(){
            if (radioS.isChecked){
                Toast.makeText(this,"Selected button - "+radioS.text,Toast.LENGTH_SHORT).show();

            }
        }

    }
}