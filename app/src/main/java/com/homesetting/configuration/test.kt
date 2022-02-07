package com.homesetting.configuration

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.firebase.database.FirebaseDatabase

class test : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        val database = FirebaseDatabase.getInstance()
        val ref = database.getReference("hogehoge")
        val buttonWrite = findViewById<Button>(R.id.writeButton)

        buttonWrite.setOnClickListener {
            ref.setValue("fugafuga")
        }
    }
}