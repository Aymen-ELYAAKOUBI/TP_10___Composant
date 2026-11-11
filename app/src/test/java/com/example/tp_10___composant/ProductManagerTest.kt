package com.example.tp_10___composant

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNull
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test

class ProductManagerTest {
    @Test
    fun addsProductsAndCalculatesTotal() {
        val manager = ProductManager()
        manager.addProduct("Keyboard", 45.0)
        manager.addProduct("Mouse", 20.0)

        assertEquals(45.0, manager.getProductPrice("Keyboard"))
        assertEquals(65.0, manager.calculateTotalPrice())
    }

    @Test
    fun rejectsNegativePrice() {
        val manager = ProductManager()
        assertThrows(IllegalArgumentException::class.java) {
            manager.addProduct("Broken", -1.0)
        }
    }

    @Test
    fun removesExistingProduct() {
        val manager = ProductManager()
        manager.addProduct("Keyboard", 45.0)

        manager.removeProduct("Keyboard")

        assertNull(manager.getProductPrice("Keyboard"))
        assertEquals(0.0, manager.calculateTotalPrice())
    }

    @Test
    fun missingProductHasNoPrice() {
        assertNull(ProductManager().getProductPrice("Unknown"))
    }
}
