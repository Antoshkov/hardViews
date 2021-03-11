package com.e.hardviews;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class MyAction {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String nameAction;
    private boolean isCreator;
    private int iconAction, iconActionReverse, amountPerDay;
    private int countPressedTimes = 0;


    public MyAction(String nameAction, int iconAction, int iconActionReverse, int amountPerDay){
        this.iconAction = iconAction;
        this.iconActionReverse = iconActionReverse;
        this.nameAction = nameAction;
        this.amountPerDay = amountPerDay;
    }

    public void addPressedTimes(){
        countPressedTimes++;
    }

    public void setIconAction(int iconAction) {
        this.iconAction = iconAction;
    }

    public void setIconActionReverse(int iconActionReverse) {
        this.iconActionReverse = iconActionReverse;
    }

    public void setNameAction(String nameAction) {
        this.nameAction = nameAction;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAmountPerDay(int amountPerDay) {
        this.amountPerDay = amountPerDay;
    }

    public void setCountPressedTimes(int countPressedTimes) {
        this.countPressedTimes = countPressedTimes;
    }

    public void setCreator(boolean creator) {
        isCreator = creator;
    }

    public int getIconAction() {
        return iconAction;
    }

    public int getIconActionReverse() {
        return iconActionReverse;
    }

    public String getNameAction() {
        return nameAction;
    }

    public int getId() {
        return id;
    }

    public int getAmountPerDay() {
        return amountPerDay;
    }

    public int getCountPressedTimes() {
        return countPressedTimes;
    }

    public boolean isCreator() {
        return isCreator;
    }
}
