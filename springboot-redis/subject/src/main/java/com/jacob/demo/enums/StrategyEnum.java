package com.jacob.demo.enums;

/**
 * @author shuliangzhao
 * @Title: StrategyEnum
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/5/29 0:00
 */
public enum StrategyEnum {

    BlanceDeduction("com.jacob.demo.strategy.impl.BlanceDeduction"),
    IdCardDeduction("com.jacob.demo.strategy.impl.IdCardDeduction");
    String value = "";

    private StrategyEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}