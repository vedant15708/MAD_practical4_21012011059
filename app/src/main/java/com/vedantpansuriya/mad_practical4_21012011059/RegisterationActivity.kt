package com.vedantpansuriya.mad_practical4_21012011059

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegisterationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registeration)
        val Login:Button = findViewById(R.id.login_btn)
        Login.setOnClickListener{
            Intent(this@RegisterationActivity,LoginActivity::class.java).also{startActivity(it)}
        }
    }
}