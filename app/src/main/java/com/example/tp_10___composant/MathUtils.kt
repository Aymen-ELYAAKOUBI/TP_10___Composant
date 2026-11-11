package com.example.tp_10___composant

class MathUtils {
    fun add(a: Int, b: Int): Int = a + b

    fun subtract(a: Int, b: Int): Int = a - b

    fun divide(a: Int, b: Int): Double {
        require(b != 0) { "Divisor must not be zero" }
        return a.toDouble() / b
    }

    fun isEven(n: Int): Boolean = n % 2 == 0
}
