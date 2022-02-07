package com.homesetting.configuration

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.homesetting.configuration.databinding.ActivityMainBinding
import com.homesetting.configuration.databinding.ActivityMotionBinding

class MotionActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMotionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMotionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.home1Button.setOnClickListener {onhome1ButtonTapped(it) }
    }
    fun onhome1ButtonTapped(view: View?) {
        val intent = Intent(this, Mainhome::class.java)
        startActivity(intent)
    }
}