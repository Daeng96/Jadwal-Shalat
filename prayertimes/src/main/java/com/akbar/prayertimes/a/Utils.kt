package com.akbar.prayertimes.a

import kotlin.math.PI

object Utils {
    const val INVALID_TRIGGER = -.999

    const val DEG_TO_10_BASE = 1 / 15.0

    const val CENTER_OF_SUN_ANGLE = -0.833370

    const val ALTITUDE_REFRACTION = 0.0347

    const val REF_LIMIT = 9999999.0

    const val KAABA_LAT = 21.423333

    const val KAABA_LONG = 39.823333

    const val DEF_NEAREST_LATITUDE = 48.5

    const val DEF_IMSAAK_ANGLE = 1.5

    const val DEF_IMSAAK_INTERVAL = 10.0

    const val DEFAULT_ROUND_SEC = 30.0

    const val AGGRESSIVE_ROUND_SEC = 1.0

    /* UTILITIES */
    fun DEG_TO_RAD(A: Double): Double {
        return A * (PI / 180.0)
    }

    fun RAD_TO_DEG(A: Double): Double {
        return A / (PI / 180.0)
    }
}