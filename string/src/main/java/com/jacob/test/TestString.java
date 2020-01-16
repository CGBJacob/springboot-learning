/**
 * Copyright (C), 2015-2020, XXX有限公司
 * Author:   guanbinchen
 * Date:     2020/1/3 14:29
 * Description: 字符串测试
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jacob.test;

import org.junit.Test;

import java.util.Arrays;

/**
 * 〈一句话功能简述〉<br>
 * 〈字符串测试〉
 *
 * @author GuanBinChen
 * @create 2020/1/3
 * @since 1.0.0
 */
public class TestString {

    @Test
    public String myTrim(String str) {
        if (str != null) {
            int start = 0;
            int end = str.length();
            while (start < end && str.charAt(start) == ' ') {
                start++;
            }

            while (end > start && str.charAt(end) == ' ') {
                end--;
            }

            if (str.charAt(start) == ' ') {
                return "";
            }

            return str.substring(start, end + 1);
        }
        return null;
    }

    @Test       //实现中间字符串反转
    public String reverse2(String str, int start, int end) {
        StringBuffer sb = new StringBuffer(str.length());
        sb.append(str.substring(0, start));
        for (int i = end; i >= start; i--) {
            sb.append(str.charAt(i));
        }
        sb.append(str.substring(end, str.length() - 1));
        return sb.toString();
    }


    @Test
    public void testSort() {
        StringBuffer str = new StringBuffer("abcwerthelloyuiodef");
        String s = str.reverse().toString();        //转成StringBuffer进行字符串反转
        char[] arr = s.toCharArray();
        Arrays.sort(arr);

        String newStr = new String(arr);
        System.out.println(newStr);
    }


    @Test
    public void testStringAndStringBuffer() {
        String str = null;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        System.out.println(stringBuffer.length());


        System.out.println(stringBuffer);


        StringBuffer stringBuffer1 = new StringBuffer(str);

        System.out.println("stringBuffer1 = " + stringBuffer1);

    }
}
