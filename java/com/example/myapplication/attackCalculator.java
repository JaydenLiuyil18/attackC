package com.example.myapplication;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * ATTACK CALCULATOR
 */
public class attackCalculator {
    /**
     * healthOfMonster
     */
    private fairy b;
    private int healthOfMonster;
    public attackCalculator(String monster) {
        if (monster.equals("first monster")) {
            healthOfMonster = 999;
        }
        if (monster.equals("second monster")) {
            healthOfMonster = 9999;
        }
        if (monster.equals("third monster")) {
            healthOfMonster = 999999;
        }
        if (monster.equals("fourth monster")) {
            healthOfMonster = 99999999;
        }
        if (monster.equals("first monster")) {
            healthOfMonster = 999999999;
        }
        Boolean result = false;
        int count = 0;


        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        while (!result) {
            try {
                Thread.sleep(1 * 1000); //设置暂停的时间 1 秒
                count++;
                System.out.println(sdf.format(new Date()) + "--循环执行第" + count + "次");
                // 假设我们有五个英雄
                //healthOfMonster = healthOfMonster - first.a/first.i;
                if (count == 3) {
                    result = true;
                    break;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public int remainingHealth(Object a) {
        //healthOfMonster = healthOfMonster - first.a/first.i
        if (a == null || !(a instanceof fairy)) {
            return -1;
        }
        return 0;
    }




}

