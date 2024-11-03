package com.example.victor_vallecillos_uf1_act11

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val registerButton = findViewById<Button>(R.id.registerButton);

        registerButton.setOnClickListener{
            Toast.makeText(this, "Registre complet", Toast.LENGTH_LONG).show();
        }

        val relativeLayoutButton = findViewById<Button>(R.id.relativeLayoutButton);

        relativeLayoutButton.setOnClickListener{
            val intent = Intent(this, RelativeLayoutActivity::class.java)
            startActivity(intent)
        }


        val constraintLayoutButton = findViewById<Button>(R.id.constraintLayoutButton);
        constraintLayoutButton.setOnClickListener{
            val intent = Intent(this, ConstraintLayoutActivity::class.java)
            startActivity(intent)
        }
    }
}