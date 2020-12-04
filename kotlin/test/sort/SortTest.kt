package sort

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SortTest {
    @Test
    fun isSortedTest() {
        val testListA = listOf(5, 19, 2, 4, 8)

        assertEquals(false, testListA.isSorted())

        val testListB = listOf(1, 3, 6, 9, 12, 32, 100)

        assertEquals(true, testListB.isSorted())
    }

    @Test
    fun sortTest() {
        val testList = listOf(2, 1, 3)

        assertEquals(true, testList.quickSort().isSorted())
    }

    @Test
    fun sortTest2() {
        val testList = listOf(3, 123941823, 13, 12394, 12381, 1, 48, 0)

        assertEquals(true, testList.quickSort().isSorted())
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