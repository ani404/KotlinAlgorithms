fun <T : Comparable<T>> bubbleSort(array: Array<T>) {
    val n = array.size

    for (i in 0 until n - 1) {
        var swapped = false

        for (j in 0 until n - 1 - i) {
            if (array[j] > array[j + 1]) {
                // Swap elements if they are in the wrong order
                val temp = array[j]
                array[j] = array[j + 1]
                array[j + 1] = temp
                swapped = true
            }
        }

        // If no two elements were swapped, the array is already sorted
        if (!swapped) {
            break
        }
    }
}

fun main() {
    // Example usage:
    val array = arrayOf(64, 25, 12, 22, 11)
    println("Original Array: ${array.joinToString(", ")}")

    bubbleSort(array)

    println("Sorted Array: ${array.joinToString(", ")}")
}
