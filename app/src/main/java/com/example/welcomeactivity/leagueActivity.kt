package com.example.welcomeactivity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*

class leagueActivity : BaseActivity() {

    var selectedLeague = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onMensClicked(view: View){
        womensLeagueBttm.isChecked = false
        mixedButton.isChecked = false

        selectedLeague = "mens"

    }

    fun onWomensClicked(view: View){
        mensLeagueBttm.isChecked = false
        mixedButton.isChecked = false

        selectedLeague = "women"

    }

    fun onMixedClicked(view: View){
        womensLeagueBttm.isChecked = false
        mensLeagueBttm.isChecked = false

        selectedLeague = "mixed"

    }


    fun leagueNextClicked(view: View) {
        if (selectedLeague != "") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_LEAGUE, selectedLeague)
            startActivity(skillActivity)
        }else{
            Toast.makeText(this, "Please select a league", Toast.LENGTH_SHORT).show()
        }
    }


}
