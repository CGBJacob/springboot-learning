package com.strategy.factory;

import com.strategy.eunm.RechargeTypeEnum;
import com.strategy.service.Strategy;
import com.strategy.service.impl.BusiAcctStrategy;
import com.strategy.service.impl.CardStrategy;
import com.strategy.service.impl.EBankStrategy;
import com.strategy.service.impl.MobileStrategy;

import java.util.HashMap;
import java.util.Map;

public class StrategyFactory {

    private static StrategyFactory factory = new StrategyFactory();

    private StrategyFactory() {
    }

    private static Map strategyMap = new HashMap<>();

    static {
        strategyMap.put(RechargeTypeEnum.E_BANK.value(), new EBankStrategy());
        strategyMap.put(RechargeTypeEnum.BUSI_ACCOUNTS.value(), new BusiAcctStrategy());
        strategyMap.put(RechargeTypeEnum.MOBILE.value(), new MobileStrategy());
        strategyMap.put(RechargeTypeEnum.CARD_RECHARGE.value(), new CardStrategy());
    }

    public Strategy creator(Integer type) {
        return (Strategy) strategyMap.get(type);
    }

    public static StrategyFactory getInstance() {
        if (factory != null) {
            synchronized (StrategyFactory.class) {
                if (factory != null) {
                    return factory;
                }
            }
        }
        return null;
    }
} 