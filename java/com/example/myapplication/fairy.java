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
     * @param a
     *
     */
    private fairy f;
    //其实我觉得如果我要计算英雄的伤害那每秒伤害肯定是a/i
    //然后我在另一个class里call的话 fairy first = new fairy（first）
    // 我觉得不一定要在construction里给定属性，属性应该是固定好的
    // 先不设定升级，你看一下能不能按照我在attackcalculator的方式比如先固定5个英雄
    public fairy(fairy a) {
//        name = n;
//        level = l;
//        attack = a;
//        interval = i;
        f = a;
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
