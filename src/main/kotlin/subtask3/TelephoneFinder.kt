package subtask3

class TelephoneFinder {

    // TODO: Complete the following function
    private val phoneKeyboard : Array<Array<String>> =
        arrayOf(arrayOf("1","2","3"),
                arrayOf("4","5","6"),
                arrayOf("7","8","9"),
                arrayOf("*", "0", "#"))

    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {
        val numberNeighbour : MutableList<String> = mutableListOf()
        return if(number[0] != '-') {
            for (i in number.indices){
                val indexes = indexesNumberOfKeyboard(number[i].toString())
                if (indexes[0]-1 in phoneKeyboard.indices)
                    if (phoneKeyboard[indexes[0]-1][indexes[1]] != "#" && phoneKeyboard[indexes[0]-1][indexes[1]] != "*")
                        numberNeighbour.add(
                    number.replaceRange(
                        i..i,
                        phoneKeyboard[indexes[0] - 1][indexes[1]]))
                if (indexes[0]+1 in phoneKeyboard.indices)
                    if (phoneKeyboard[indexes[0]+1][indexes[1]] != "#" && phoneKeyboard[indexes[0]+1][indexes[1]] != "*")
                        numberNeighbour.add(
                    number.replaceRange(
                        i..i,
                        phoneKeyboard[indexes[0] + 1][indexes[1]]))
                if (indexes[1]-1 in phoneKeyboard[0].indices)
                    if (phoneKeyboard[indexes[0]][indexes[1]-1] != "#" && phoneKeyboard[indexes[0]][indexes[1]-1] != "*")
                        numberNeighbour.add(
                    number.replaceRange(
                        i..i,
                        phoneKeyboard[indexes[0]][indexes[1] - 1]))
                if (indexes[1]+1 in phoneKeyboard[0].indices)
                    if (phoneKeyboard[indexes[0]][indexes[1]+1] != "#" && phoneKeyboard[indexes[0]][indexes[1]+1] != "*")
                        numberNeighbour.add(
                    number.replaceRange(
                        i..i,
                        phoneKeyboard[indexes[0]][indexes[1] + 1]))
                }
            numberNeighbour.toTypedArray()
            }
        else {
            null
        }
    }
    private fun indexesNumberOfKeyboard(s : String) : Array<Int> {
        val indexes = arrayOf(0,0)
        for (i in phoneKeyboard.indices) {
            if (phoneKeyboard[i].indexOfFirst { it == s } != -1) {
                indexes[0] = i
                indexes[1] = phoneKeyboard[i].indexOfFirst { it == s }
            }
        }
        return indexes
    }

}
