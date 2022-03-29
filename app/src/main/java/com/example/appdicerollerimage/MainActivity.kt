package com.example.appdicerollerimage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button)
        button.setOnClickListener{msgDiceRoller()}
    }

    private fun msgDiceRoller() {
        val txtNumber: EditText = findViewById(R.id.txtNumber)
        val numberSort = (1..6).random()
        val diceRoller: ImageView = findViewById(R.id.diceRoller)

        if (Integer.parseInt(txtNumber.text.toString()) == numberSort)
            Toast.makeText(this, "You Win!", Toast.LENGTH_SHORT).show()
        else
            Toast.makeText(this, "You Lose!", Toast.LENGTH_SHORT).show()

        val drawableResource = when(numberSort) {
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else->R.drawable.dice_6
        }

        diceRoller.setImageResource(drawableResource)

    }
}