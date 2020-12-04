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
    if (size < 2) return true

    val half = size / 2

    val left = subList(0, half)
    val right = subList(half, size)

    if (left.median() > median() || right.median() < median()) return false

    return left.isSorted() && right.isSorted()
}

fun List<Int>.median() = this[size / 2]

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