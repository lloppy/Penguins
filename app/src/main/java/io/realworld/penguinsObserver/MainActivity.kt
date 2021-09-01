package io.realworld.penguinsObserver

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.realworld.blowjobcounter.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //cоздание станции
        val penguStation = PenguStation()
        penguStation.addPenguMan(PenguMan(name = "Polina", secondname = "Ankudinova"))
        penguStation.addPenguMan(PenguMan(name = "Alena", secondname = "Kiseleva"))
        penguStation.addPenguMan(PenguMan(name = "Vova", secondname = "Putin"))

        penguStation.changeCoordinates()
    }
}