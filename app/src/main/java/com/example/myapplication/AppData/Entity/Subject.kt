package com.example.myapplication.AppData.Entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class Subject(
    @PrimaryKey
    var subject_id:Int = 0,
    var name:String
)