package com.jacob.Strategy;

import com.jacob.designPattern.UserType;

// 黄金会员策略
public class GoldStrategy implements Strategy {

    @Override
    public double compute(long money) {
        System.out.println("黄金会员 8折");
        return money * 0.8;
    }

    @Override
    public int getType() {
        return UserType.GOLD_VIP.getCode();
    }
}