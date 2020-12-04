package sort

import kotlin.random.Random

class QuickSort {
    fun sort(list: List<Int>): List<Int> {
        if (list.size < 2) return list

        val x = pickPivot(list)

        val listSmallerThanX = sort(list.filter { y -> y < x })
        val listGreaterThanX = sort(list.filter { y -> y > x })

        return listSmallerThanX + listOf(x) + listGreaterThanX
    }

    private fun pickPivot(list: List<Int>): Int = list[Random.nextInt(list.size)]
}