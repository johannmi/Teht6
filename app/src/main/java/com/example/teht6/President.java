package com.example.teht6;

public class President {
    private String name, desc;
    private int yearA, yearB;

    public President(String name, int yearA, int yearB, String desc) {
        this.name = name;
        this.yearA = yearA;
        this.yearB = yearB;
        this.desc = desc;
    }

    public String getName() { return this.name; }

    public int getYearA() {
        return this.yearA;
    }

    public int getYearB() {
        return this.yearB;
    }

    public String getDesc() {
        return this.desc;
    }


    @Override
    public String toString() {
        return getName();
    }

}
