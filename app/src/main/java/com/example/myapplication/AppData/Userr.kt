package com.example.myapplication.AppData

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class Userr(
    @PrimaryKey(autoGenerate = true)
    var id:Int = 0,
    var user_name:String,
    var user_login:String,
    var user_password:String,
    var role:Boolean
)