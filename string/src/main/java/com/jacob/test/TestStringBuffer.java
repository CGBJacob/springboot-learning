/**
 * Copyright (C), 2015-2020, XXX有限公司
 * Author:   guanbinchen
 * Date:     2020/1/3 15:21
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
public class TestStringBuffer {

    public static void main(String[] args) {
        String str = null;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);   //把null看作有一个字符串
        System.out.println(stringBuffer.length());


        System.out.println(stringBuffer);


        StringBuffer stringBuffer1 = new StringBuffer(str);

        System.out.println("stringBuffer1 = " + stringBuffer1);     //null转成StringBuffer也是空
    }
}
