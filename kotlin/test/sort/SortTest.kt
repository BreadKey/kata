package sort

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SortTest {
    @Test
    fun sortTest() {
        val testList = listOf(2, 1, 3)

        assertEquals(false, testList.isSorted())
        assertEquals(listOf(1, 2, 3), testList.quickSort())
    }

    @Test
    fun sortTest2() {
        val testList = listOf(3, 123941823, 13, 12394, 12381, 1, 48, 0)

        assertEquals(false, testList.isSorted())
        assertEquals(listOf(0, 1,3, 13, 48, 12381, 12394, 123941823), testList.quickSort())
    }

    @Test
    fun sortTest3() {
        val testList = listOf(5, 1, 4, 2, 5)

        assertEquals(listOf(1, 2, 4, 5, 5), testList.quickSort())
    }

    @Test
    fun subsetTest() {
        val a = listOf(5, 2, 4, 1)
        val b = listOf(1, 2)

        assertEquals(true, b.isSubsetOf(a))
    }

    @Test
    fun subsetTest2() {
        val a = listOf(1, 2, 3)
        val b = listOf(4, 5)

        assertEquals(false ,b.isSubsetOf(a))
    }
}