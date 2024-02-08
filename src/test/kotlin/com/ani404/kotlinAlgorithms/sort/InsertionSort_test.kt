package com.ani404.kotlinAlgorithms.sort

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class InsertionSortTest {

    @Test
    fun testInsertionSortWithIntegers() {
        val array = arrayOf(64, 25, 12, 22, 11)
        val expectedSortedArray = arrayOf(11, 12, 22, 25, 64)

        insertionSort(array)

        assertArrayEquals(expectedSortedArray, array)
    }

    @Test
    fun testInsertionSortWithStrings() {
        val array = arrayOf("apple", "orange", "banana", "grape")
        val expectedSortedArray = arrayOf("apple", "banana", "grape", "orange")

        insertionSort(array)

        assertArrayEquals(expectedSortedArray, array)
    }

    @Test
    fun testInsertionSortWithEmptyArray() {
        val array = emptyArray<String>()

        insertionSort(array)

        assertArrayEquals(emptyArray<String>(), array)
    }

    @Test
    fun testInsertionSortWithAlreadySortedArray() {
        val array = arrayOf(1, 2, 3, 4, 5)
        val expectedSortedArray = arrayOf(1, 2, 3, 4, 5)

        insertionSort(array)

        assertArrayEquals(expectedSortedArray, array)
    }

    @Test
    fun testInsertionSortWithDescendingArray() {
        val array = arrayOf(5, 4, 3, 2, 1)
        val expectedSortedArray = arrayOf(1, 2, 3, 4, 5)

        insertionSort(array)

        assertArrayEquals(expectedSortedArray, array)
    }

    @Test
    fun testInsertionSortWithRepeatedValues() {
        val array = arrayOf(3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5)
        val expectedSortedArray = arrayOf(1, 1, 2, 3, 3, 4, 5, 5, 5, 6, 9)

        insertionSort(array)

        assertArrayEquals(expectedSortedArray, array)
    }

    @Test
    fun testInsertionSortWithRandomOrder() {
        val array = arrayOf(7, 2, 9, 1, 8, 5, 3, 6, 4)
        val expectedSortedArray = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)

        insertionSort(array)

        assertArrayEquals(expectedSortedArray, array)
    }
}
