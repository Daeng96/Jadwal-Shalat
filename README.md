# JadwalWaktuShalat
Library android Untuk Jadwal Shalat

### Contoh Cara Penggunaan
```
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
  
  dependencies {
	    implementation 'com.github.Daeng96:Jadwal-Shalat:2.0'
	}
```
```
        val today = SimpleDate(GregorianCalendar())
        val local = LocationPT(-5.0, 119.0, 8.0,0)
        val azan = PrayerTimesCalculate(local, Methods.EGYPT_SURVEY)
        val pt = azan.getPrayerTimes(today)
        val tvq = findViewById<TextView>(R.id.tvQ)
        tvq.text= pt.assr().toString()
```

### Umm Quro
```
	val ummQuro = UmmulQura()
        val fullDate = ummQuro.getFullCalendar(today)
	val monthName = ummQuro.getMonthString(today)
	val dates = ummQuro.getCalendarUmmQuro(today)
	val day = dates[0]
	val month = dates[1]
	val year = dates[2]	
```

### Lisensi

Ahmed Eltaher 2016

Modifications Copyright 2021 Akbar Sukku

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
