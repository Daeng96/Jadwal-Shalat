package com.akbar.jadwalshalat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.akbar.prayertimes.a.LocationPT
import com.akbar.prayertimes.a.SimpleDate
import com.akbar.prayertimes.b.Methods
import com.akbar.prayertimes.b.PrayerTimesCalculate
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tvQ = findViewById<TextView>(R.id.tvQ)
        val today = SimpleDate(GregorianCalendar())
        val local = LocationPT(-5.285635, 119.761148,8.0,0)
        val adzan = PrayerTimesCalculate(local, Methods.EGYPT_SURVEY)
        val pyt = adzan.getPrayerTimes(today)
        tvQ.text = pyt.assr().toString()
    }
}

