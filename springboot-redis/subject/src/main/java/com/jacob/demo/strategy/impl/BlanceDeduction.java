/**
 * Copyright (C), 2015-2020, XXX有限公司
 * Author:   guanbinchen
 * Date:     2020/1/2 14:23
 * Description: 扣除策略一
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jacob.demo.strategy.impl;

import com.jacob.demo.strategy.Deduction;
import com.jacob.demo.test.WxBlance;
import com.jacob.demo.test.WxTrade;

/**
 * 〈一句话功能简述〉<br>
 * 〈扣除策略一〉
 *
 * @author GuanBinChen
 * @create 2020/1/2
 * @since 1.0.0
 */
public class BlanceDeduction implements Deduction {
    @Override
    public boolean exec(WxBlance wxBlance, WxTrade wxTrade) {
        if (wxBlance.getBlance().compareTo(wxTrade.getTradeAmout()) >= 0) {
            wxTrade.setUserAmout(wxBlance.getBlance());
        }
        return true;
    }
}
