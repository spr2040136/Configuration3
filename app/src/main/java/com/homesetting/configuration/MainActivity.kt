package com.homesetting.configuration

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.FirebaseDatabase
import com.homesetting.configuration.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.informationchangeButton.setOnClickListener { oninformationchangeButtonTapped(it) }
        binding.mailchangeButton.setOnClickListener { onmailchangeButtonTapped(it) }
        binding.passwordchangeButton.setOnClickListener { onpasswordchangeButtonTapped(it) }

        val database = FirebaseDatabase.getInstance()
        val myRef = database.reference
        myRef.setValue("Hello World !")

    }

    fun oninformationchangeButtonTapped(view: View?) {
        val intent = Intent(this, IndividualActivity::class.java)
        startActivity(intent)
    }

    fun onmailchangeButtonTapped(view: View?) {
        val intent = Intent(this, MailActivity::class.java)
        startActivity(intent)
    }
    fun onpasswordchangeButtonTapped(view: View?) {
        val intent = Intent(this, PasswordActivity::class.java)
        startActivity(intent)
    }
}