package com.example.myapplication;

public class fairy {
    /**
     * name
     */
    private String name;
    /**
     * level
     */
    private int level;
    /**
     * attack harm
     */
    private int attack;
    /**
     * attack interval
     */
    private double interval;
    /**
     * constructor
     * @param n name.
     * @param l level.
     * @param a attack.
     * @param i interval.
     */
    public fairy(String n, int l, int a, double i) {
        name = n;
        level = l;
        attack = a;
        interval = i;
    }
    /**
     * get name.
     * @return name.
     * "" should be name; i need to change to commit
     */
    public String getName() {
        return name;
    }
    /**
     * get level
     * @return level.
     */
    public int getLevel() {
        return level;
    }
    /**
     * get attack harm
     * @return attack.
     */
    public int getHarm() {
        return attack;
    }

    /**
     * get interval.
     * @return interval.
     */
    public double getInterval() {
        return interval;
    }

}
