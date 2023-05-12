package com.example.myapplication.AppData.Entity

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    foreignKeys = [
        ForeignKey(
            entity = Guruh::class,
            parentColumns = ["guruh_id"],
            childColumns = ["guruh_id"]
        ),
    ForeignKey(
        entity = Userr::class,
        parentColumns = ["id"],
        childColumns = ["user_id"]
    )
    ]
)
class StudentGuruh (
    @PrimaryKey(autoGenerate = true)
    var id:Int = 0,
    var user_id:Int,
    var guruh_id:Int
        )