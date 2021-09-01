package io.realworld.penguinsObserver

import android.util.Log


class PenguMan (val name: String, val secondname: String): ManBehavior {

    private val TAG = PenguMan::class.java.simpleName


    override fun helpForPenguin(x: Int, y: Int) {
        if ((x > 90) || (y > 90)) {
            Log.e(TAG, " $x, $y, Пингвин упал(")
        } else {
            Log.e(TAG, "$x, $y, Пингвин жив и здоров)")
        }
    }

}