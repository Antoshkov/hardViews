package com.e.hardviews;

public class DefaultAction {

    public static final int ALL = 0;
    public static final int HEALTH = 101;
    public static final int FOOD = 201;
    public static final int TIME = 31;
    public static final int BAD_HABITS = 666;

    private int iconAction, iconActionReverse, actionType;
    private String nameAction;

    public DefaultAction(String nameAction, int iconAction, int iconActionReverse, int actionType){
        this.actionType = actionType;
        this.iconAction = iconAction;
        this.iconActionReverse = iconActionReverse;
        this.nameAction = nameAction;
    }

    public int getIconActionReverse() {
        return iconActionReverse;
    }

    public String getNameAction() {
        return nameAction;
    }

    public int getIconAction() {
        return iconAction;
    }

    public int getActionType() {
        return actionType;
    }

    public void setIconActionReverse(int iconActionReverse) {
        this.iconActionReverse = iconActionReverse;
    }

    public void setNameAction(String nameAction) {
        this.nameAction = nameAction;
    }

    public void setIconAction(int iconAction) {
        this.iconAction = iconAction;
    }

    public void setActionType(int actionType) {
        this.actionType = actionType;
    }
}
