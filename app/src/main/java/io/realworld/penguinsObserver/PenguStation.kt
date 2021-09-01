package io.realworld.penguinsObserver

import android.os.Handler
import java.util.*

class PenguStation {

    //список наблюдающих людей
    private val people: MutableList<ManBehavior> = LinkedList()
    //penguin's coordinates
    var x = 0
    var y = 0

    fun addPenguMan(manBehavior: ManBehavior) {
        people.add(manBehavior)
    }

    fun removePenguMan(manBehavior: ManBehavior) {
        people.remove(manBehavior)
    }

    fun changeCoordinates(){
        x = Random().nextInt(180)
        y = Random().nextInt(180)

        //проходимся по товарищам
        people.forEach {
            it.helpForPenguin(x = x, y = y)
        }

        //обновлялка
        var handler = Handler()
        handler.postDelayed({
            changeCoordinates()
        }, 3000)

    }
}