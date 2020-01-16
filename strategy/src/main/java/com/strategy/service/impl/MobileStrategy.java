/**
 * Copyright (C), 2015-2020, XXX有限公司
 * Author:   guanbinchen
 * Date:     2020/1/2 15:09
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.strategy.service.impl;

import com.strategy.eunm.RechargeTypeEnum;
import com.strategy.service.Strategy;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author GuanBinChen
 * @create 2020/1/2
 * @since 1.0.0
 */
public class MobileStrategy implements Strategy {
    public Double calRecharge(Double charge, RechargeTypeEnum type) {
        return charge;
    }
}
