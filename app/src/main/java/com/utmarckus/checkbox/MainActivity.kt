package com.utmarckus.checkbox

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var questionTV: TextView
    private lateinit var checkbox1: CheckBox
    private lateinit var checkbox2: CheckBox
    private lateinit var checkbox3: CheckBox
    private lateinit var button: Button
    private lateinit var resultTV: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        questionTV = findViewById(R.id.questionTV)
        checkbox1 = findViewById(R.id.questionOption1)
        checkbox2 = findViewById(R.id.questionOption2)
        checkbox3 = findViewById(R.id.questionOption3)
        button = findViewById(R.id.button)
        resultTV = findViewById(R.id.resultTV)

        button.setOnClickListener {
            var res = ""
            if (checkbox1.isChecked) res += "${checkbox1.text} "
            if (checkbox2.isChecked) res += "${checkbox2.text} "
            if (checkbox3.isChecked) res += "${checkbox3.text} "

            resultTV.text = res.ifBlank { "None" }
        }
    }
}
