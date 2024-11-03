package com.example.victor_vallecillos_uf1_act11

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ConstraintLayoutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constraint_layout)

        val registerButton = findViewById<Button>(R.id.registerButton);

        registerButton.setOnClickListener{
            Toast.makeText(this, "Registre complet", Toast.LENGTH_LONG).show();
        }

        val relativeLayoutButton = findViewById<Button>(R.id.relativeLayoutButton);

        relativeLayoutButton.setOnClickListener{
            val intent = Intent(this, RelativeLayoutActivity::class.java)
            startActivity(intent)
        }

        val linearLayoutButton = findViewById<Button>(R.id.linearLayoutButton);

        linearLayoutButton.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}