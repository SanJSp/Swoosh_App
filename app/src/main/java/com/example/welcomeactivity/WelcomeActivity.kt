package com.example.welcomeactivity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getStartedButton.setOnClickListener {
            val leagueIntent = Intent(this, leagueActivity::class.java)
            startActivity(leagueIntent)
        }
    }
}
