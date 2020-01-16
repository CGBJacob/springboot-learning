/**
 * Copyright (C), 2015-2020, XXX有限公司
 * Author:   guanbinchen
 * Date:     2020/1/2 14:25
 * Description: 策略封装
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jacob.demo;

import com.jacob.demo.strategy.Deduction;
import com.jacob.demo.test.WxBlance;
import com.jacob.demo.test.WxTrade;

/**
 * 〈一句话功能简述〉<br>
 * 〈策略封装〉
 *
 * @author GuanBinChen
 * @create 2020/1/2
 * @since 1.0.0
 */
public class DeDuctionContext {

    private Deduction deduction;


    public DeDuctionContext(Deduction deduction) {
        this.deduction = deduction;
    }

    public boolean exec(WxBlance wxBlance, WxTrade wxTrade) {
        return deduction.exec(wxBlance, wxTrade);
    }
}

