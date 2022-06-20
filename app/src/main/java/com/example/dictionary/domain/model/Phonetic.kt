package com.example.dictionary.domain.model


data class Phonetic(
    val audio: String,
    val license: LicenseX,
    val sourceUrl: String,
    val text: String
)
