/**
 * Copyright (C), 2015-2020, XXX有限公司
 * Author:   guanbinchen
 * Date:     2020/1/2 13:59
 * Description: 找乔国老帮忙，使孙权不能杀刘备
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.cbf4life.strategy;

/**
 * 〈一句话功能简述〉<br>
 * 〈找乔国老帮忙，使孙权不能杀刘备〉
 *
 * @author GuanBinChen
 * @create 2020/1/2
 * @since 1.0.0
 */
public class BackDoor implements IStrategy {
    @Override
    public void operate() {
        System.out.println("找乔国老帮忙，让吴国太给孙权施加压力");
    }
}
