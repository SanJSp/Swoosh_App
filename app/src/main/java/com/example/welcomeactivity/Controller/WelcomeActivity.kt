package com.example.welcomeactivity.Controller

import android.content.Intent
import android.os.Bundle
import com.example.welcomeactivity.R
import kotlinx.android.synthetic.main.activity_main.*

class WelcomeActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getStartedButton.setOnClickListener {
            val leagueIntent = Intent(this, leagueActivity::class.java)
            startActivity(leagueIntent)
        }
    }
}
