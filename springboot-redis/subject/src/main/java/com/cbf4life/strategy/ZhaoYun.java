/**
 * Copyright (C), 2015-2020, XXX有限公司
 * Author:   guanbinchen
 * Date:     2020/1/2 14:04
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.cbf4life.strategy;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author GuanBinChen
 * @create 2020/1/2
 * @since 1.0.0
 */
public class ZhaoYun {

    public static void main(String[] args) {
        Context context;

        System.out.println("----------------------刚刚到吴国，拆开了第一个------------------------");
        context = new Context(new BackDoor());
        context.operate();
        System.out.println("\n\n\n\n\nn\n\n\n");
        System.out.println("----------------------刘备乐不思蜀，拆开了第一个------------------------");
        context = new Context(new GivenGreenLight());
        context.operate();
        System.out.println("\n\n\n\n\n\n\n\n");
        System.out.println("----------------------刚刚到吴国，拆开了第一个------------------------");
        context = new Context(new BlockEnemy());
        context.operate(); //孙夫人退兵
        System.out.println("\n\n\n\n\n\n\n\n");
    }
}
