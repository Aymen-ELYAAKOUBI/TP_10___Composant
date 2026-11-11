package com.example.tp_10___composant

fun validerMotDePasse(motDePasse: String): Boolean {
    val longueurValide = motDePasse.length >= 8
    val contientMajuscule = motDePasse.any { it.isUpperCase() }
    val contientChiffre = motDePasse.any { it.isDigit() }
    return longueurValide && contientMajuscule && contientChiffre
}
