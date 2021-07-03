package subtask2

import kotlin.math.sqrt

class SquareDecomposer {

    fun decomposeNumber(number: Int): Array<Int>? {
        var result : Array<Int>? = null
        var draftList : MutableList<Int> = mutableListOf()
        if( number >= 5) {
            for (i in number - 1 until number/2) {
                var currentElement = i
                var nextElement : Int = sqrt((number * number - i * i).toDouble()).toInt()
                if(nextElement != 0) draftList.add(currentElement)
            }
        }
        return  result
    }

    private fun iteration(curElem : Int, nextElem : Int) {
        for (i in nextElem - 1 until nextElem / 2) {

        }
    }
}
