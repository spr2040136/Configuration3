package com.homesetting.configuration

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.homesetting.configuration.databinding.ActivityMaintestBinding

class MaintestSubActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMaintestBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMaintestBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_sub_activitycalendar)


        fun onback11ButtonTapped(view: View?) {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}