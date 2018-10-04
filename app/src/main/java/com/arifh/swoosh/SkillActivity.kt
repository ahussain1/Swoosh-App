package com.arifh.swoosh

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class SkillActivity : AppCompatActivity() {

    var league: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.skill_activity)
        league = intent.getStringExtra(EXTRA_LEAGUE)
        println(league)
    }
}
