/**
 * Copyright (C), 2015-2020, XXX有限公司
 * Author:   guanbinchen
 * Date:     2020/1/14 14:40
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jacob.jvm;

/**
 * 〈一句话功能简述〉<br>
 * 〈模拟执行15次minor gc进入老年代〉
 *
 * @author GuanBinChen
 * @create 2020/1/14
 * @since 1.0.0
 */
public class Demo5 {


    public static void main(String[] args) {
//        byte[] b = new byte[128 * 1024];
//        byte[] bytes;
//        for (int i = 0; i < 16; i++) {
//            bytes = null;
//            bytes = new byte[3 * 1024 * 1024];
//            bytes = null;
//            bytes = new byte[3 * 1024 * 1024];
//        }


        int age = 16;
        byte[] array2 = new byte[128 * 1024];
        while (age >= 0) {
            byte[] array1 = new byte[2 * 1024 * 1024];
            array1 = new byte[1024 * 1024];
            array1 = new byte[1024 * 1024];
            array1 = null;
            byte[] array3 = new byte[2 * 1024 * 1024];
            age--;
        }
    }
}
