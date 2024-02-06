package com.ani404.kotlinAlgorithms.sort

fun <T : Comparable<T>> selectionSort(array: Array<T>) {
    val n = array.size

    for (i in 0 until n - 1) {
        var minIndex = i

        for (j in i + 1 until n) {
            if (array[j] < array[minIndex]) {
                minIndex = j
            }
        }

        // Swap the found minimum element with the first element
        val temp = array[minIndex]
        array[minIndex] = array[i]
        array[i] = temp
    }
}