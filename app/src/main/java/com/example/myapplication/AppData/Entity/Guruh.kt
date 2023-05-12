package com.example.myapplication.AppData.Entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class Guruh(
    @PrimaryKey(autoGenerate = true)
    var guruh_id:Int = 0,
    var name:String,
    var sinf:String
)