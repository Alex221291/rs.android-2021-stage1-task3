package subtask2

import kotlin.math.sqrt

class SquareDecomposer {

    fun decomposeNumber(number: Int): Array<Int>? {
        return if( number >= 5) {
            iteration(number * number, number - 1)
        } else {
            null
        }
    }

    private fun iteration(squareNumber : Int, nextStep : Int) : Array<Int>?{
        for (i in nextStep downTo sqrt((nextStep*nextStep/2).toDouble()).toInt() + 1) {
            val remains = squareNumber - i * i

            if(remains == 0) {
                return arrayOf(i)
            }
            else {

                val next = sqrt(remains.toDouble()).toInt()
                val nextElem = if(next < i) iteration(remains, next) else iteration(remains, i - 1)

                if (!nextElem.isNullOrEmpty()) return nextElem + arrayOf(i)
            }
        }
        return null
    }
}
