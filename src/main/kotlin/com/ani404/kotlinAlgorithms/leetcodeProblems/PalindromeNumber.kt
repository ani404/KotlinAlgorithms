package com.ani404.kotlinAlgorithms.leetcodeProblems

class PalindromeNumber {
    fun isPalindrome(x: Int): Boolean {
        if (x < 0) return false

        var number = x
        var reversedNumber = 0

        while (number > 0) {
            val digit = number % 10
            reversedNumber = reversedNumber * 10 + digit
            number /= 10
        }

        return x == reversedNumber
    }
}