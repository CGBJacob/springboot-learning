package com.jacob.Strategy;

import com.jacob.designPattern.UserType;

//普通会见计算方法
public class OrdinaryStrategy implements Strategy {

    @Override
    public double compute(long money) {
        System.out.println("普通会员不打折");
        return money;
    }

    @Override
    public int getType() {
        return UserType.SILVER.getCode();
    }
}