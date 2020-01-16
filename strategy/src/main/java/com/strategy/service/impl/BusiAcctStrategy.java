package com.strategy.service.impl;

import com.strategy.eunm.RechargeTypeEnum;
import com.strategy.service.Strategy;

public class BusiAcctStrategy implements Strategy {

    public Double calRecharge(Double charge, RechargeTypeEnum type) {
        return charge * 0.90;
    }

}