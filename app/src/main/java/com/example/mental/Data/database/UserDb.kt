package com.example.mental.Data.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity("user")
class UserDb (
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,
    var Ism: String,
    var yosh: Int,


)   {



}