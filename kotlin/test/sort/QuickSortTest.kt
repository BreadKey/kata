package sort

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class QuickSortTest {
    private val quickSort = QuickSort()

    @Test
    fun sortTest() {
        val testList = listOf(2, 1, 3)

        assertEquals(listOf(1, 2, 3), quickSort.sort(testList))
    }

    @Test
    fun sortTest2() {
        val testList = listOf(3, 123941823, 13, 12394, 12381, 1, 48, 0)

        assertEquals(listOf(0, 1,3, 13, 48, 12381, 12394, 123941823), quickSort.sort(testList))
    }
}