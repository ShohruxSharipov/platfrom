package com.example.myapplication.AppData

import androidx.room.Dao
import androidx.room.Query

@Dao
interface UserDao {

    @Query("select * from user where login = :login && password = :password")
    fun getUser(login:String,password:String)
}