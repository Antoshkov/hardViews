package com.e.hardviews;

import androidx.room.Database;
import androidx.room.RoomDatabase;


@Database(entities = {MyAction.class}, version = 1)
    public abstract class AppDatabase extends RoomDatabase {
        public abstract MyActionsDBDao actionsDBDao();
    }

