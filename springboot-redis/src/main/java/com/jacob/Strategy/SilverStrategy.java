package com.jacob.Strategy;

import com.jacob.designPattern.UserType;

//白银会员优惠方式
public class SilverStrategy implements Strategy {
    @Override
    public double compute(long money) {

        System.out.println("白银会员，优惠50元");
        return money - 50;
    }

    @Override
    public int getType() {
        return UserType.SILVER_VIP.getCode();
    }
}
