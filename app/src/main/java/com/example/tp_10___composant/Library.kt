package com.example.tp_10___composant

class Library {
    private val books = mutableListOf<Book>()

    fun addBook(book: Book) {
        books.add(book)
    }

    fun findBookByTitle(title: String): Book? =
        books.firstOrNull { it.title.equals(title, ignoreCase = true) }

    fun borrowBook(title: String): Boolean {
        val book = findBookByTitle(title) ?: return false
        if (!book.isAvailable) return false
        book.isAvailable = false
        return true
    }
}
