package com.homesetting.configuration

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.homesetting.configuration.databinding.ActivityPasswordBinding

class PasswordActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPasswordBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}