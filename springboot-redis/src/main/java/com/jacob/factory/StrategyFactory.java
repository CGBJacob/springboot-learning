/**
 * Copyright (C), 2015-2019, XXX有限公司
 * Author:   cheng
 * Date:     2019/12/30 16:08
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jacob.factory;

import com.jacob.Strategy.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 〈一句话功能简述〉<br>
 * 〈策略模式+简单工厂模式〉
 *
 * @author GuanBinChen
 * @create 2019/12/30
 * @since 1.0.0
 */
public class StrategyFactory {

    private Map<Integer, Strategy> map;
    private List<Strategy> list;

    public StrategyFactory() {
        List<Strategy> strategies = new ArrayList<>();

        strategies.add(new OrdinaryStrategy());
        strategies.add(new SilverStrategy());
        strategies.add(new GoldStrategy());
        strategies.add(new PlatinumStrategy());
//        map = strategies.stream().collect(Collectors.toMap(Strategy::getType, strategy -> strategy));
        list = strategies.stream().collect(Collectors.toList());


    }

    public static class Holder {
        public static StrategyFactory instance = new StrategyFactory();
    }

    public static StrategyFactory getInstance() {
        return Holder.instance;
    }

    public Strategy get(Integer type) {
        return list.get(type);
    }


}
