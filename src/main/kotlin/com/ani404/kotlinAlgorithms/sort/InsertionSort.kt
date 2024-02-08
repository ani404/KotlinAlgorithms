package com.ani404.kotlinAlgorithms.sort

fun <T : Comparable<T>> insertionSort(array: Array<T>) {
    val n = array.size

    for (i in 1 until n) {
        val key = array[i]
        var j = i - 1

        // Move elements greater than key to one position ahead of their current position
        while (j >= 0 && array[j] > key) {
            array[j + 1] = array[j]
            j--
        }

        array[j + 1] = key
    }
}
