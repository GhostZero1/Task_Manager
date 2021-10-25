package com.example.task.data;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.task.model.Note;

@Database(entities = Note.class, version = 1,exportSchema = false)
public abstract class AppDatebase extends RoomDatabase {
    public abstract NoteDao noteDao();
}
