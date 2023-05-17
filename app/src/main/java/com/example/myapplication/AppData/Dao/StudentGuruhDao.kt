package com.example.myapplication.AppData.Dao

import androidx.room.Dao
import androidx.room.Query
import com.example.myapplication.AppData.Entity.Userr

@Dao
interface StudentGuruhDao {

    @Query("select * from userr where guruh_id = :guruh ")
    fun getGuruh(guruh:Int):List<Userr>
}