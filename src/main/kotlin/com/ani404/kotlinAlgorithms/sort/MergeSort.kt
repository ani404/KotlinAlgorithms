package com.ani404.kotlinAlgorithms.sort

fun <T : Comparable<T>> mergeSort(array: Array<T>) {
    if (array.size <= 1) {
        return
    }

    val middle = array.size / 2
    val left = array.copyOfRange(0, middle)
    val right = array.copyOfRange(middle, array.size)

    mergeSort(left)
    mergeSort(right)

    merge(array, left, right)
}

private fun <T : Comparable<T>> merge(array: Array<T>, left: Array<T>, right: Array<T>) {
    var i = 0
    var j = 0
    var k = 0

    while (i < left.size && j < right.size) {
        if (left[i] <= right[j]) {
            array[k++] = left[i++]
        } else {
            array[k++] = right[j++]
        }
    }

    while (i < left.size) {
        array[k++] = left[i++]
    }

    while (j < right.size) {
        array[k++] = right[j++]
    }
}
