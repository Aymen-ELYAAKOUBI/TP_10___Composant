package com.example.tp_10___composant

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class MathUtilsTest {
    @Test
    fun addAndSubtractReturnCorrectResults() {
        val mathUtils = MathUtils()
        assertEquals(7, mathUtils.add(3, 4))
        assertEquals(-1, mathUtils.subtract(3, 4))
    }

    @Test
    fun divideReturnsDoubleAndRejectsZeroDivisor() {
        val mathUtils = MathUtils()
        assertEquals(2.5, mathUtils.divide(5, 2), 0.0)
        assertThrows(IllegalArgumentException::class.java) { mathUtils.divide(5, 0) }
    }

    @Test
    fun isEvenHandlesEvenAndOddNumbers() {
        val mathUtils = MathUtils()
        assertTrue(mathUtils.isEven(8))
        assertFalse(mathUtils.isEven(7))
    }
}
