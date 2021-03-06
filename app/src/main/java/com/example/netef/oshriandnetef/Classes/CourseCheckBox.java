package com.example.netef.oshriandnetef.Classes;

import android.view.MenuItem;
import android.widget.CheckBox;

import java.util.HashMap;
import java.util.HashSet;

public class CourseCheckBox  implements ICourse{

    private int showCode;
    private int courseCode;
    private String name;
    private HashSet<Integer> set;
    private MenuItem menuItem;
    private boolean isSelected;

    public CourseCheckBox(String name, int courseCode, int showCode, MenuItem menuItem,boolean isSelected) {
        this.isSelected=isSelected;
        this.name = name;
        this.courseCode = courseCode;
        this.showCode = showCode;
        this.menuItem = menuItem;
        set = new HashSet<Integer>() {{
            add(showCode);
        }};
    }
    @Override
    public int getCourseCode() {
        return this.courseCode;
    }

    @Override
    public String getCourseName() {
        return this.name;
    }

    @Override
    public HashSet<Integer> getShowCodes() {
        return set;
    }

    @Override
    public HashMap<Integer, IShow> getIShows() {
        return null;
    }


    public int getShowCode() {
        return this.showCode;
    }


    public MenuItem getMenuItem() {
        return menuItem;
    }

    public void setMenuItem(MenuItem menuItem) {
        this.menuItem = menuItem;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean Selected) {
        isSelected = Selected;
    }
}
