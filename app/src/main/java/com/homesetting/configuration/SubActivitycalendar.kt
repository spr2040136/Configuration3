package com.homesetting.configuration

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.FirebaseDatabase

class SubActivitycalendar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub_activitycalendar)
        
        val database = FirebaseDatabase.getInstance()
        val ref = database.getReference("日付")
        val buttonWrite = findViewById<Button>(R.id.writeButton)

        buttonWrite.setOnClickListener {
            ref.setValue(" ")
        }
    }
}