package sort

import kotlin.random.Random

fun List<Int>.quickSort(): List<Int> {
    if (size < 2) return this

    val x = pickPivot(this)

    val listSmallerThanX = filter { y -> y < x }.quickSort()

    var isSameElementExist = false
    val listGreaterThanX = filter { y ->
        if (x == y) {
            if (isSameElementExist) return@filter true
            else {
                isSameElementExist = true
                return@filter false
            }
        }

        y > x
    }.quickSort()

    return listSmallerThanX + listOf(x) + listGreaterThanX
}

private fun pickPivot(list: List<Int>): Int = list[Random.nextInt(list.size)]

fun List<Int>.isSorted(): Boolean {
    for (index in 0 until size - 1) {
        if (get(index) > get(index + 1))
            return false
    }

    return true
}

fun List<Int>.isSubsetOf(other: List<Int>): Boolean {
    if (other.size < size) return false

    val sortedOther = other.quickSort()
    val sortedList = quickSort()

    var currentIndex = 0

    for (value in sortedOther) {
        if (value == sortedList[currentIndex]) {
            currentIndex++
            if (currentIndex == sortedList.size) return true
        } else if (value > sortedList[currentIndex]) return false
    }

    return false
}