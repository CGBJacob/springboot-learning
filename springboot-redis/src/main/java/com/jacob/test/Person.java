/**
 * Copyright (C), 2015-2020, XXX有限公司
 * Author:   guanbinchen
 * Date:     2020/1/2 10:23
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
 * @create 2020/1/2
 * @since 1.0.0
 */
public class Person {

    private int id;


    public static int total = 0;


    public Person() {
        total++;
        id = total;
    }
}
