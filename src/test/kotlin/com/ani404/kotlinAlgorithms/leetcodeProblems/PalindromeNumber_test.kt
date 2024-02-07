package com.ani404.kotlinAlgorithms.leetcodeProblems

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class PalindromeNumberTest {

    private val palindromeNumber = PalindromeNumber()

    @Test
    fun testPositivePalindrome() {
        assertTrue(palindromeNumber.isPalindrome(121))
    }

    @Test
    fun testNegativePalindrome() {
        assertFalse(palindromeNumber.isPalindrome(-121))
    }

    @Test
    fun testSingleDigit() {
        assertTrue(palindromeNumber.isPalindrome(0))
    }

    @Test
    fun testNonPalindrome() {
        assertFalse(palindromeNumber.isPalindrome(123))
    }

    @Test
    fun testLargePalindrome() {
        assertTrue(palindromeNumber.isPalindrome(12321))
    }

    @Test
    fun testEvenDigitPalindrome() {
        assertTrue(palindromeNumber.isPalindrome(1221))
    }

    @Test
    fun testNegativeNonPalindrome() {
        assertFalse(palindromeNumber.isPalindrome(-123))
    }
}
