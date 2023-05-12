package com.example.myapplication.AppData.Dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.myapplication.AppData.Entity.Userr

@Dao
interface UserDao {

    @Query("select * from userr where user_login = :login and user_password = :password")
    fun getUser(login:String,password:String): Userr

    @Insert
    fun addUser(userr: Userr)

    @Query("select user_name from userr")
    fun getUsersName():List<String>
}