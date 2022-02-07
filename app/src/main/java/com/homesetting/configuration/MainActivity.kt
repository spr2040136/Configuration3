package com.homesetting.configuration

import android.content.ContentValues.TAG
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.ktx.database
import com.google.firebase.database.ktx.getValue
import com.google.firebase.ktx.Firebase
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

        val database = Firebase.database
        val myRef = database.getReference("message")
        myRef.setValue("Hello, World!")

        myRef.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                val value = dataSnapshot.getValue<String>()
                Log.d(TAG, "Value is: $value")
            }

            override fun onCancelled(error: DatabaseError) {
                // Failed to read value
                Log.w(TAG, "Failed to read value.", error.toException())
            }
        })

    }
    // Read from the database


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