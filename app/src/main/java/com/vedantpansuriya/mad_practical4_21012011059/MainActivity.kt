package com.vedantpansuriya.mad_practical4_21012011059

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val login:Button=findViewById(R.id.login)
        login.setOnClickListener{
            Intent(this@MainActivity,LoginActivity::class.java).also{startActivity(it)}
        }
        val signup:Button=findViewById(R.id.signup)
        signup.setOnClickListener{
            Intent(this@MainActivity,RegisterationActivity::class.java).also{startActivity(it)}
        }
    }
}