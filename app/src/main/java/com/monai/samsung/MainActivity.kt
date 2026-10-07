package com.monai.samsung

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val messageInput = findViewById<EditText>(R.id.messageInput)
        val sendButton = findViewById<Button>(R.id.sendButton)
        val answerText = findViewById<TextView>(R.id.answerText)

        sendButton.setOnClickListener {
            val message = messageInput.text.toString()

            if (message.isNotEmpty()) {
                answerText.text = "Ты написал:\n$message"
            } else {
                answerText.text = "Напиши сообщение."
            }
        }
    }
}
