package com.example.myapplication.AppData

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.myapplication.AppData.Dao.SubjectDao
import com.example.myapplication.AppData.Dao.TeacherSubjectDao
import com.example.myapplication.AppData.Dao.UserDao
import com.example.myapplication.AppData.Entity.Userr

@Database(entities = [Userr::class], version = 1)
abstract class AppDatabase: RoomDatabase() {
    abstract fun getUserDao(): UserDao
    abstract fun getSubjectDao(): SubjectDao
    abstract fun getTeacherSubjectDao(): TeacherSubjectDao

    companion object{
        var instanse:AppDatabase? = null

        fun getInstanse(context:Context):AppDatabase{
            if (instanse == null){
                instanse = Room.databaseBuilder(context,AppDatabase::class.java,"app_db")
                    .allowMainThreadQueries()
                    .build()
            }
            return instanse!!
        }
    }
}