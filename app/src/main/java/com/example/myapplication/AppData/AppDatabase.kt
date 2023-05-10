package com.example.myapplication.AppData

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Userr::class], version = 1)
abstract class AppDatabase: RoomDatabase() {
    abstract fun getUserDao(): UserDao

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