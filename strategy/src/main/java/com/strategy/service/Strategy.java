package com.strategy.service;

import com.strategy.eunm.RechargeTypeEnum;

public interface Strategy {


    public Double calRecharge(Double charge, RechargeTypeEnum type);
}