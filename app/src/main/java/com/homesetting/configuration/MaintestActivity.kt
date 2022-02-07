package com.homesetting.configuration

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.CalendarView
import android.widget.CalendarView.OnDateChangeListener
import androidx.appcompat.app.AppCompatActivity


class MaintestActivity : AppCompatActivity(), OnDateChangeListener {
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maintest)
        val calendarView = findViewById<View>(R.id.calendarView) as CalendarView
        calendarView.setOnDateChangeListener(this)
    }


    override fun onSelectedDayChange(
        view: CalendarView, year: Int, month: Int,
        dayOfMonth: Int
    ) {
        val varIntent = Intent(this@MaintestActivity, MaintestSubActivity::class.java)
        startActivity(varIntent)
    }
}