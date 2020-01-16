/**
 * Copyright (C), 2015-2020, XXX有限公司
 * Author:   guanbinchen
 * Date:     2020/1/7 16:00
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jacob.test;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author GuanBinChen
 * @create 2020/1/7
 * @since 1.0.0
 */
public class TestInteger {


    public static void main(String[] args) {


        Integer i = 128;
        Integer j = 128;
        //底层采用byte字节进行存储,字节得有效范围是-128-127

        System.out.println(i.equals(j));
        System.out.println("j = " + j);

    }
}
