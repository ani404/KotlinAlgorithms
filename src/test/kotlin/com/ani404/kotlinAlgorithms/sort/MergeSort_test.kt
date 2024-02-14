package com.ani404.kotlinAlgorithms.sort

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class MergeSortTest {

    @Test
    fun testMergeSortWithIntegers() {
        val array = arrayOf(64, 25, 12, 22, 11)
        val expectedSortedArray = arrayOf(11, 12, 22, 25, 64)

        mergeSort(array)

        assertArrayEquals(expectedSortedArray, array)
    }

    @Test
    fun testMergeSortWithStrings() {
        val array = arrayOf("apple", "orange", "banana", "grape")
        val expectedSortedArray = arrayOf("apple", "banana", "grape", "orange")

        mergeSort(array)

        assertArrayEquals(expectedSortedArray, array)
    }

    @Test
    fun testMergeSortWithEmptyArray() {
        val array = emptyArray<String>()

        mergeSort(array)

        assertArrayEquals(emptyArray<String>(), array)
    }

    @Test
    fun testMergeSortWithAlreadySortedArray() {
        val array = arrayOf(1, 2, 3, 4, 5)
        val expectedSortedArray = arrayOf(1, 2, 3, 4, 5)

        mergeSort(array)

        assertArrayEquals(expectedSortedArray, array)
    }

    @Test
    fun testMergeSortWithDescendingArray() {
        val array = arrayOf(5, 4, 3, 2, 1)
        val expectedSortedArray = arrayOf(1, 2, 3, 4, 5)

        mergeSort(array)

        assertArrayEquals(expectedSortedArray, array)
    }

    @Test
    fun testMergeSortWithRepeatedValues() {
        val array = arrayOf(3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5)
        val expectedSortedArray = arrayOf(1, 1, 2, 3, 3, 4, 5, 5, 5, 6, 9)

        mergeSort(array)

        assertArrayEquals(expectedSortedArray, array)
    }

    @Test
    fun testMergeSortWithRandomOrder() {
        val array = arrayOf(7, 2, 9, 1, 8, 5, 3, 6, 4)
        val expectedSortedArray = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)

        mergeSort(array)

        assertArrayEquals(expectedSortedArray, array)
    }
}
