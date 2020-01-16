/**
 * Copyright (C), 2015-2020, XXX有限公司
 * Author:   guanbinchen
 * Date:     2020/1/14 15:41
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jacob.jvm;

/**
 * 〈一句话功能简述〉<br>
 * 〈FullGC 查看〉
 *
 * @author GuanBinChen
 * @create 2020/1/14
 * @since 1.0.0
 */
public class DemoFullGC {

    public static void main(String[] args) {
        byte[] array1 = new byte[4 * 1024 * 1024];
        array1 = null;

        byte[] array2 = new byte[2 * 1024 * 1024];
        byte[] array3 = new byte[2 * 1024 * 1024];
        byte[] array4 = new byte[2 * 1024 * 1024];
        byte[] array5 = new byte[128 * 1024];

        byte[] array6 = new byte[2 * 1024 * 1024];

        byte[] array7 = new byte[2 * 1024 * 1024];
        byte[] array8 = new byte[2 * 1024 * 1024];
        byte[] array10 = new byte[2 * 1024 * 1024];
        array6 = null;
        array8 = null;
        byte[] array11 = new byte[2 * 1024 * 1024];

    }
}
