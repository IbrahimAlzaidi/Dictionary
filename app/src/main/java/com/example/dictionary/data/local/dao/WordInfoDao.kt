package com.example.dictionary.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.dictionary.core.util.Constants.WORD_INFO_TABLE_NAME
import com.example.dictionary.data.local.entity.WordInfoEntity
import com.example.dictionary.domain.model.WordInfo

@Dao
interface WordInfoDao {
    
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertWordInfos(infos: List<WordInfoEntity>)

    @Query("DELETE FROM $WORD_INFO_TABLE_NAME WHERE word IN(:words)")
    suspend fun deleteWordInfos(words: List<String>)

    @Query("SELECT * FROM $WORD_INFO_TABLE_NAME WHERE word LIKE '%' || :word || '%' ")
    suspend fun getWordInfos(word: String): List<WordInfoEntity>


}