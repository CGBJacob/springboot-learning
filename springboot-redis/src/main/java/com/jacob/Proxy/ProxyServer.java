/**
 * Copyright (C), 2015-2020, XXX有限公司
 * Author:   guanbinchen
 * Date:     2020/1/2 10:48
 * Description: 代理服务
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jacob.Proxy;

/**
 * 〈一句话功能简述〉<br>
 * 〈代理服务〉
 *
 * @author GuanBinChen
 * @create 2020/1/2
 * @since 1.0.0
 */
public class ProxyServer implements NetWork {

    private NetWork netWork;

    public ProxyServer(NetWork netWork) {
        this.netWork = netWork;
    }

    public void check() {
        System.out.println("正在检查网络----");
    }


    @Override
    public void browse() {
        check();
        netWork.browse();
    }
}
