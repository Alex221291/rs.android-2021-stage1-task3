package subtask1

class Combinator {

    fun checkChooseFromArray(array: Array<Int>): Int? {
        var posters : Int? = null
        var i = 1
        var flag = true
        while((i <= array[1]) && flag){
            val currentPosters : Long = factorial(array[1]) /(factorial(i) * factorial(array[1] - i))
            if((array[0].toLong()) == currentPosters ) {
                posters = i
                flag = false
            }
            i++
        }
        return posters
    }

    private fun factorial(num: Int): Long {
        var result = 1L
        for (i in 2..num) result *= i
        return result
    }
}
