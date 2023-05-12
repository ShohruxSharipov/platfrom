package com.example.myapplication.AppData.Dao

import androidx.room.Dao
import androidx.room.Query
import com.example.myapplication.AppData.Entity.Guruh
import com.example.myapplication.AppData.Entity.Subject
import com.example.myapplication.AppData.Entity.Userr

@Dao
interface TeacherSubjectDao {

    @Query("select * from Subject where subject_id = :subject_id")
    fun getTeacherSubject(subject_id:Int):Subject?

    @Query("select * from Userr where id = :user_id")
    fun getUser(user_id:Int): Userr?


    @Query("select guruh_id from TeacherSubject where user_id = :user_id")
    fun getOquvchilarim(user_id:Int):Int?
}