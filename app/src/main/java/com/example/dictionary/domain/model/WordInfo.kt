package com.example.dictionary.domain.model

import com.example.dictionary.data.local.entity.WordInfoEntity

data class WordInfo(
    val meaning: List<Meaning>,
    val origin: String,
    val phonetic: String,
    val sourceUrls: List<String>,
    val word: String,
){
    fun toWordInfoEntity(): WordInfoEntity {
        return WordInfoEntity(
            meanings = meaning.map { it.toMeaning() },
            origin = origin,
            phonetic = phonetic,
            word = word,
            sourceUrls = sourceUrls
        )
    }
}