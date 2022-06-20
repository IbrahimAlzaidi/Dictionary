package com.example.dictionary.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.dictionary.core.util.Constants.WORD_INFO_TABLE_NAME
import com.example.dictionary.domain.model.License
import com.example.dictionary.domain.model.Meaning
import com.example.dictionary.domain.model.WordInfo

@Entity(tableName = WORD_INFO_TABLE_NAME)
data class WordInfoEntity(
    val word: String,
    val phonetic: String,
    val origin: String,
    val meanings: List<Meaning>,
    val sourceUrls: List<String>,
    @PrimaryKey val id: Int? = null,
) {
    fun toWordInfo(): WordInfo {
        return WordInfo(
            meaning = meanings,
            word = word,
            origin = origin,
            phonetic = phonetic,
            sourceUrls = sourceUrls
        )
    }
}
