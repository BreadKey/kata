package sort

import kotlin.random.Random

class QuickSort {
    fun sort(list: List<Int>): List<Int> {
        if (list.size < 2) return list

        val x = pickPivot(list)

        val listSmallerThenX = sort(list.filter { y -> y < x })
        val listGreaterThenX = sort(list.filter { y -> y > x })

        return listSmallerThenX + listOf(x) + listGreaterThenX
    }

    private fun pickPivot(list: List<Int>): Int {
        return list[Random.nextInt(list.size)]
    }
}