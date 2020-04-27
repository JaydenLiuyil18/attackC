package com.example.myapplication;

public class fairy {
    /**
     * name
     */
    private String ownOrnotStatus;
    /**
     * ilike.
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
     *
     *
     */
    private int f;
    //其实我觉得如果我要计算英雄的伤害那每秒伤害肯定是a/i
    //然后我在另一个class里call的话 fairy first = new fairy（first）
    // 我觉得不一定要在construction里给定属性，属性应该是固定好的
    // 先不设定升级，你看一下能不能按照我在attackcalculator的方式比如先固定5个英雄

    /**
     * do it.
     * @param a i like it.
     */
    public fairy(int a) {
//        name = n;
//        level = l;
//        attack = a;
//        interval = i;
        f = a;
        if (a == 1) {
            name = "first";
            level = 1;
            attack = 50;
            interval = 0.5;
            ownOrnotStatus = "OWN";
        }
        if (a == 2) {
            name = "second";
            level = 1;
            attack = 500;
            interval = 0.5;
            ownOrnotStatus = "not";
        }
        if (a == 3) {
            name = "third";
            level = 1;
            attack = 5000;
            interval = 0.5;
            ownOrnotStatus = "not";
        }
        if (a == 4) {
            name = "fourth";
            level = 1;
            attack = 50000;
            interval = 0.5;
            ownOrnotStatus = "not";
        }
        if (a == 5) {
            name = "fifth";
            level = 1;
            attack = 500000;
            interval = 0.5;
            ownOrnotStatus = "not";
        }
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

    public String getOwnOrnotStatus() {
        return ownOrnotStatus;
    }

    public void setOwnOrnotStatus(String a) {
        ownOrnotStatus = a;
    }

    public void setLevel(int a) {
        level = a;
    }

    public void setAttack(int a) {
        attack = a;
    }
}
