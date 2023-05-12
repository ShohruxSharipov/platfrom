package com.example.myapplication.AppData.Entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class StudentGr (
    @PrimaryKey(autoGenerate = true)
    var id:Int = 0,
    var user_id: String
        )