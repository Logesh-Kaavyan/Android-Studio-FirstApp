package com.example.myapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapp.commonIntents.AlarmActivity
import com.example.myapp.commonIntents.DialActivity

class Main : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val DialButton = findViewById<Button>(R.id.dialbutton)
        val AlarmButton = findViewById<Button>(R.id.alarmbutton)

        DialButton.setOnClickListener{
            val intent = Intent(this, DialActivity::class.java)
            startActivity(intent)
        }
        AlarmButton.setOnClickListener{
            val intent = Intent(this, AlarmActivity::class.java)
            startActivity(intent)
        }
    }

}