/**
 * Copyright (C), 2015-2020, XXX有限公司
 * Author:   guanbinchen
 * Date:     2020/1/2 10:47
 * Description: 被代理类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jacob.Proxy;

/**
 * 〈一句话功能简述〉<br>
 * 〈被代理类〉
 *
 * @author GuanBinChen
 * @create 2020/1/2
 * @since 1.0.0
 */
public class RealServer implements NetWork {
    @Override
    public void browse() {
        System.out.println("我可以上网了");
    }
}
