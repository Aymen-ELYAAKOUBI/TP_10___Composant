package com.example.tp_10___composant

class ProductManager {
    private val products = linkedMapOf<String, Double>()

    fun addProduct(name: String, price: Double) {
        require(price > 0.0) { "Product price must be positive" }
        products[name] = price
    }

    fun removeProduct(name: String) {
        products.remove(name)
    }

    fun getProductPrice(name: String): Double? = products[name]

    fun calculateTotalPrice(): Double = products.values.sum()
}
