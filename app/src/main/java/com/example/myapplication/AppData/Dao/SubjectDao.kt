package com.example.myapplication.AppData.Dao

import androidx.room.Dao
import androidx.room.Insert
import com.example.myapplication.AppData.Entity.Subject

@Dao
interface SubjectDao {

    @Insert
    fun addSubject(subject: Subject)
}