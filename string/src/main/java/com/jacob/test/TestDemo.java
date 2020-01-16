/**
 * Copyright (C), 2015-2020, XXX有限公司
 * Author:   guanbinchen
 * Date:     2020/1/3 15:31
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
 * @create 2020/1/3
 * @since 1.0.0
 */
public class TestDemo {


    public static void main(String[] args) {
        String test = "我爱中国";
        StringBuffer all = new StringBuffer();      //引用数据类型底层使用chat[]数组进行存储-字符数组
        for (int i = test.length() - 1; i >= 0; i--) {
            all.append(test.charAt(i));
        }
        System.out.println(test);
        System.out.println(all.toString());
    }
}
