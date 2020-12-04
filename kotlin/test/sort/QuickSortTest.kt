package sort

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class QuickSortTest {
    @Test
    fun sortTest() {
        val testList = listOf(2, 1, 3)

        val quickSort = QuickSort()

        assertEquals(listOf(1, 2, 3), quickSort.sort(testList))
    }
}