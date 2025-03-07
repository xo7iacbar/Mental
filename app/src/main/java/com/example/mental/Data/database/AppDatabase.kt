package com.example.mental.Data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [UserDb::class], version = 1, exportSchema = true)
abstract class AppDatabase: RoomDatabase() {
    abstract  fun getService():Servis
    companion object{
        fun getDb(context: Context):AppDatabase{
            return Room.databaseBuilder(context,AppDatabase::class.java,"my.db").allowMainThreadQueries().build()
        }
    }
}


























































