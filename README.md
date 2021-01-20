# JadwalWaktuShalat
Library android Untuk Jadwal Shalat

# Contoh Cara Penggunaan
<pre><code>
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
  
  dependencies {
	    implementation 'com.github.Daeng96:Jadwal-Shalat:1.0'
	}
</code></pre>


        val today = SimpleDate(GregorianCalendar())
        val local = LocationPT(-5.0, 119.0, 8.0,0)
        val azan = PrayerTimesCalculate(local, Methods.EGYPT_SURVEY)
        val pt = azan.getPrayerTimes(today)
        val tvq = findViewById<TextView>(R.id.tvQ)
        tvq.text= pt.assr().toString()
