package com.akbar.jadwalshalat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.akbar.prayertimes.a.LocationPT
import com.akbar.prayertimes.a.SimpleDate
import com.akbar.prayertimes.b.Methods
import com.akbar.prayertimes.b.PrayerTimesCalculate
import com.akbar.prayertimes.c.UmmulQura
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val hCal = findViewById<TextView>(R.id.tv_hcal)
        val fajar = findViewById<TextView>(R.id.fajar)
        val sunrise = findViewById<TextView>(R.id.sunrise)
        val dzuhr = findViewById<TextView>(R.id.dzuhr)
        val asar = findViewById<TextView>(R.id.asar)
        val magrib = findViewById<TextView>(R.id.magrib)
        val isya = findViewById<TextView>(R.id.isya)

        val today = SimpleDate(GregorianCalendar())
        val local = LocationPT(-5.285635, 119.761148, 8.0, 0)
//        Methods.KEMENAG_INDONESIA.offset = true
//       Methods.KEMENAG_INDONESIA.shurooqOffset = 0.0
        val adzan = PrayerTimesCalculate(local, Methods.KEMENAG_INDONESIA)
        val pyt = adzan.getPrayerTimes(SimpleDate(7,2,2021))


        val ummQuro = UmmulQura()
        val getFull = ummQuro.getFullCalendar(today)
        hCal.text = getFull
        fajar.text = pyt.fajr().toString()
        sunrise.text = pyt.shuruq().toString()
        dzuhr.text = pyt.thuhr().toString()
        asar.text = pyt.assr().toString()
        magrib.text = pyt.maghrib().toString()
        isya.text = pyt.ishaa().toString()
    }
}

