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
public class Demo4 {
    public static void main(String[] args) {

        byte[] b = new byte[4 * 1024 * 1024];

        byte[] d = new byte[128 * 1024];

        byte[] c = new byte[1024 * 1024];
        c = new byte[1024 * 1024];
        c = new byte[1024 * 1024];
        c = null;
        byte[] a = new byte[1 * 1024 * 1024];
        byte[] ab = new byte[1 * 1024 * 1024];
        byte[] aba = new byte[1 * 1024 * 1024];
    }
}
