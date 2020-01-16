/**
 * Copyright (C), 2015-2019, XXX有限公司
 * Author:   cheng
 * Date:     2019/12/30 15:34
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jacob.designPattern;

import com.jacob.Strategy.Strategy;
import com.jacob.factory.StrategyFactory;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author GuanBinChen
 * @create 2019/12/30
 * @since 1.0.0
 */
public class TestDesignPattern {


    private static double getResult(long money, int type) {

        if (money < 1000) {
            return money;
        }

        Strategy strategy = StrategyFactory.getInstance().get(type);

        if (strategy == null) {
            throw new IllegalArgumentException("please input right type");
        }

        return strategy.compute(money);
    }


    public static void main(String[] args) {
        getResult(10000, 1000);
    }


}
