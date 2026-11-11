package com.example.tp_10___composant

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class PasswordValidatorTest {
    @Test
    fun acceptsPasswordMeetingAllRules() {
        assertTrue(validerMotDePasse("Android7"))
    }

    @Test
    fun rejectsPasswordWhenEachRuleIsViolated() {
        assertFalse(validerMotDePasse("Andr7")) // Too short
        assertFalse(validerMotDePasse("android7")) // No uppercase letter
        assertFalse(validerMotDePasse("Android!")) // No digit
    }
}
