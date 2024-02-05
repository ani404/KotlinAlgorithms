package com.ani404.kotlinAlgorithms.sort

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test
class BubbleSortTest {

    @Test
    fun testBubbleSortWithIntegers() {
        val array = arrayOf(64, 25, 12, 22, 11)
        val expectedSortedArray = arrayOf(11, 12, 22, 25, 64)

        bubbleSort(array)

        assertArrayEquals(expectedSortedArray, array)
    }

    @Test
    fun testBubbleSortWithStrings() {
        val array = arrayOf("apple", "orange", "banana", "grape")
        val expectedSortedArray = arrayOf("apple", "banana", "grape", "orange")

        bubbleSort(array)

        assertArrayEquals(expectedSortedArray, array)
    }

    @Test
    fun testBubbleSortWithEmptyArray() {
        val array = emptyArray<String>()

        bubbleSort(array)

        assertArrayEquals(emptyArray<String>(), array)
    }

    @Test
    fun testBubbleSortWithAlreadySortedArray() {
        val array = arrayOf(1, 2, 3, 4, 5)
        val expectedSortedArray = arrayOf(1, 2, 3, 4, 5)

        bubbleSort(array)

        assertArrayEquals(expectedSortedArray, array)
    }

    @Test
    fun testBubbleSortWithDescendingArray() {
        val array = arrayOf(5, 4, 3, 2, 1)
        val expectedSortedArray = arrayOf(1, 2, 3, 4, 5)

        bubbleSort(array)

        assertArrayEquals(expectedSortedArray, array)
    }

    @Test
    fun testBubbleSortWithRepeatedValues() {
        val array = arrayOf(3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5)
        val expectedSortedArray = arrayOf(1, 1, 2, 3, 3, 4, 5, 5, 5, 6, 9)

        bubbleSort(array)

        assertArrayEquals(expectedSortedArray, array)
    }

    @Test
    fun testBubbleSortWithRandomOrder() {
        val array = arrayOf(7, 2, 9, 1, 8, 5, 3, 6, 4)
        val expectedSortedArray = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)

        bubbleSort(array)

        assertArrayEquals(expectedSortedArray, array)
    }
}
