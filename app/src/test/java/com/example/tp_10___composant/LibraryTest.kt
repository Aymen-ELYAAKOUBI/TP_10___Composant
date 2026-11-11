package com.example.tp_10___composant

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Assertions.assertNull
import org.junit.jupiter.api.Assertions.assertSame
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class LibraryTest {
    @Test
    fun addsAndFindsBookByTitle() {
        val library = Library()
        val book = Book("Le Petit Prince", "Antoine de Saint-Exupéry")
        library.addBook(book)

        assertSame(book, library.findBookByTitle("Le Petit Prince"))
        assertNull(library.findBookByTitle("Unknown"))
    }

    @Test
    fun borrowingRequiresAnAvailableBook() {
        val library = Library()
        val book = Book("Dune", "Frank Herbert")
        library.addBook(book)

        assertTrue(library.borrowBook("Dune"))
        assertFalse(book.isAvailable)
        assertFalse(library.borrowBook("Dune"))
        assertFalse(library.borrowBook("Unknown"))
        assertNotNull(library.findBookByTitle("Dune"))
    }
}
