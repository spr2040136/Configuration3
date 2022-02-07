package com.homesetting.configuration

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.homesetting.configuration.databinding.ActivityMailBinding

class MailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMailBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}