package com.e.hardviews;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface MyActionsDBDao {
    @Query("SELECT * FROM MyAction")
    List<MyAction> getAll();

    @Query("SELECT * FROM MyAction WHERE id = :id")
    MyAction getById(int id);

    @Insert
    void insert(List<MyAction> myActionsList);

    @Insert
    void insert(MyAction myAction);

    @Update
    void update(MyAction myAction);

    @Delete
    void delete(MyAction myAction);

    @Query("DELETE FROM MyAction")
    void deleteAll();
}