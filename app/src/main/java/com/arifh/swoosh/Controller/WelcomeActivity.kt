package com.arifh.swoosh.Controller
import android.content.Intent
import android.os.Bundle
import com.arifh.swoosh.BaseActivity
import com.arifh.swoosh.R
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) { //bundles contains key-value paris
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        getStartedBtn.setOnClickListener {
            val leagueIntent = Intent(this, LeagueActivity::class.java)
            startActivity(leagueIntent) //Implicit IntentAction vs Explicit Intent
        }

    }


}
