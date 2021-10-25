package com.example.task;

import android.app.Application;

import androidx.room.Room;

import com.example.task.data.AppDatebase;
import com.example.task.data.NoteDao;

public class App extends Application {
    private AppDatebase datebase;
    private NoteDao noteDao;
    private static App instance;
    public static App getInstance(){
        return instance;
    }
    @Override
    public void onCreate() {
        super.onCreate();

        instance = this;

        datebase = Room.databaseBuilder(getApplicationContext(),
                AppDatebase.class, "Dbname").allowMainThreadQueries().build();
        noteDao = datebase.noteDao();
    }

    public AppDatebase getDatebase() {
        return datebase;
    }

    public void setDatebase(AppDatebase datebase) {
        this.datebase = datebase;
    }
    public NoteDao getNoteDao() {
        return noteDao;
    }

    public void setNoteDao(NoteDao noteDao) {
        this.noteDao = noteDao;
    }
}

