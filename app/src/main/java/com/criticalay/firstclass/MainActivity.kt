package com.criticalay.firstclass

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    lateinit var rollButton:MaterialButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rollButton = findViewById(R.id.role_dice_button)

        val diceTextView = findViewById<TextView>(R.id.top_text_view)

        // click listener
        rollButton.setOnClickListener {
            val rolled = rollDice(12)
            diceTextView.text = rolled.toString()
        }

    }

    fun rollDice(numOfSides:Int) : Int{
        return (1..numOfSides).random()
    }

    fun showToast(){
        Toast.makeText(this, "Button is clicked", Toast.LENGTH_LONG).show()
    }

}