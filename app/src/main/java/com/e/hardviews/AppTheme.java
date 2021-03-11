package com.e.hardviews;

public class AppTheme {

    private int themeResource, color;

    public AppTheme(int themeResource, int color) {
        this.themeResource = themeResource;
        this.color = color;
    }

    public int getColor() {
        return color;
    }

    public int getThemeResource() {
        return themeResource;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public void setThemeResource(int themeResource) {
        this.themeResource = themeResource;
    }
}
