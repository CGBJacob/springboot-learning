/**
 * Copyright (C), 2015-2020, XXX有限公司
 * Author:   guanbinchen
 * Date:     2020/1/2 14:22
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jacob.demo.strategy;

import com.jacob.demo.test.WxBlance;
import com.jacob.demo.test.WxTrade;

/**
 * 〈一句话功能简述〉<br>
 * 〈策略接口〉
 *
 * @author GuanBinChen
 * @create 2020/1/2
 * @since 1.0.0
 */

public interface Deduction {


    boolean exec(WxBlance wxBlance, WxTrade wxTrade);
}
