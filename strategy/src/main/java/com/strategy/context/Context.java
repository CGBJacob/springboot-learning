package com.strategy.context;

import com.strategy.eunm.RechargeTypeEnum;
import com.strategy.factory.StrategyFactory;
import com.strategy.service.Strategy;

 
public class Context {
 
    private Strategy strategy;
   
    public Double calRecharge(Double charge, Integer type) {
       strategy = StrategyFactory.getInstance().creator(type);
       return strategy.calRecharge(charge, RechargeTypeEnum.valueOf(type));
    }

   
}