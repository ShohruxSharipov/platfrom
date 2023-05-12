package com.example.myapplication.AppData.Entity

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    foreignKeys = [
        ForeignKey(
            entity = Userr::class,
            parentColumns = ["id"],
            childColumns = ["user_id"]
        ),
    ForeignKey(
        entity = Subject::class,
        parentColumns = ["subject_id"],
        childColumns = ["subject_id"]
    ),
    ForeignKey(
        entity = Guruh::class,
        parentColumns = ["guruh_id"],
        childColumns = ["guruh_id"]
    )
    ]
)
class TeacherSubject(
    @PrimaryKey(autoGenerate = true)
    var t_id:Int = 0,
    var subject_id:Int,
    var guruh_id:Int
)