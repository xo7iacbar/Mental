package com.example.mental.Data.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface Servis {
        @Insert(onConflict = OnConflictStrategy.REPLACE)
        fun addUser(userDb: UserDb)

        @Query("SELECT * FROM user where id=1")
        fun User():UserDb

@Query("INSERT INTO")


    }
