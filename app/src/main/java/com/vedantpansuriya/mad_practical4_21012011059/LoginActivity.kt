package com.vedantpansuriya.mad_practical4_21012011059

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val Signup:Button = findViewById(R.id.signup_btn)
        Signup.setOnClickListener{
            Intent(this@LoginActivity,RegisterationActivity::class.java).also { startActivity(it) }
        }
    }
}