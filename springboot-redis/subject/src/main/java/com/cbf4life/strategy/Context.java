/**
 * Copyright (C), 2015-2020, XXX有限公司
 * Author:   guanbinchen
 * Date:     2020/1/2 14:01
 * Description: 计谋有了需要存放锦囊
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.cbf4life.strategy;

/**
 * 〈一句话功能简述〉<br>
 * 〈计谋有了需要存放锦囊〉
 *
 * @author GuanBinChen
 * @create 2020/1/2
 * @since 1.0.0
 */
public class Context {

    //构造函数
    private IStrategy iStrategy;


    public Context(IStrategy iStrategy) {
        this.iStrategy = iStrategy;

    }

    //出招
    public void operate() {
        this.iStrategy.operate();
    }
}
