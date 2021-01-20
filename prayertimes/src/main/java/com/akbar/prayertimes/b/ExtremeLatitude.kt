package com.akbar.prayertimes.b

class ExtremeLatitude {
    companion object {
        /**
         * none. If unable to calculate, leave only the invalid prayer
         * time as 99:99.
         */
        val NONE_EX = ExtremeLatitude()

        /**
         * Nearest Latitude: Apply to all prayer times always.
         */
        val LAT_ALL = ExtremeLatitude()

        /**
         * Nearest Latitude: Apply to Fajr and Ishaa times always.
         */
        val LAT_ALWAYS = ExtremeLatitude()

        /**
         * Nearest Latitude: Apply to Fajr and Ishaa times but only if
         * the library has detected that the current
         * Fajr or Ishaa time is invalid.
         */
        val LAT_INVALID = ExtremeLatitude()

        /**
         * Nearest Good Day: Apply to all prayer times always.
         */
        val GOOD_ALL = ExtremeLatitude()

        /**
         * Nearest Good Day: Apply to Fajr and Ishaa times but only if
         * the library has detected that the current
         * Fajr or Ishaa time is invalid. This is the
         * default method. (Default)
         */
        val GOOD_INVALID = ExtremeLatitude()

        /**
         * 1/7th of Night: Apply to Fajr and Ishaa times always.
         */
        val SEVEN_NIGHT_ALWAYS = ExtremeLatitude()

        /**
         * 1/7th of Night: Apply to Fajr and Ishaa times but only if
         * the library has detected that the current
         * Fajr or Ishaa time is invalid.
         *
         */
        val SEVEN_NIGHT_INVALID = ExtremeLatitude()

        /**
         * 1/7th of Day: Apply to Fajr and Ishaa times always.
         */
        val SEVEN_DAY_ALWAYS = ExtremeLatitude()

        /**
         * 1/7th of Day: Apply to Fajr and Ishaa times but only if the
         * library has detected that the current Fajr
         * or Ishaa time is invalid.
         */
        val SEVEN_DAY_INVALID = ExtremeLatitude()

        /**
         * Half of the Night: Apply to Fajr and Ishaa times always.
         */
        val HALF_ALWAYS = ExtremeLatitude()

        /**
         * Half of the Night: Apply to Fajr and Ishaa times but only
         * if the library has detected that the
         * current Fajr or Ishaa time is
         * invalid.
         */
        val HALF_INVALID = ExtremeLatitude()

        /**
         * Minutes from Shorooq/Maghrib: Apply to Fajr and Ishaa times always.
         */
        val MIN_ALWAYS = ExtremeLatitude()

        /**
         * Minutes from Shorooq/Maghrib: Apply to Fajr and Ishaa times but only if
         * the library has detected that the
         * current Fajr or Ishaa time is invalid.
         *
         */
        val MIN_INVALID = ExtremeLatitude()

        /**
         * Nearest Good Day: Different good days for Fajr and Ishaa (Not
         * implemented)
         */
        val GOOD_DIF = ExtremeLatitude()

    }
}