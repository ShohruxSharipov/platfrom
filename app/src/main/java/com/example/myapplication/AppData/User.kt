package com.example.myapplication.AppData

import androidx.room.PrimaryKey

class User(
    @PrimaryKey(autoGenerate = true)
    var id:Int = 0,
    var user_name:String,
    var user_login:String,
    var user_password:String,
    var role:Boolean
)