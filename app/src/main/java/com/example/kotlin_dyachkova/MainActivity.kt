package com.example.kotlin_dyachkova

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    //Объявление переменной

    private var text: String = "В магазине <осталось> 10 банок колы, а может и больше"
    private var tvText: TextView? = null;   //Создали переменную для TextView
    private var tvText2: TextView? = null;

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)  //отображение нужного слоя
        tvText = findViewById(R.id.tvTextView)    //связали переменную и компонент
        var subText: String = text.substringAfter('<')
        var subText2: String = subText.substringBefore('>')

        //Отобразить содержимое переменной tvText на компоненте tvtextView2
        tvText?.setText(subText2)



    }



}