/**
 * Copyright (C), 2015-2020, XXX有限公司
 * Author:   guanbinchen
 * Date:     2020/1/2 10:54
 * Description: 代码测试
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jacob.test;

/**
 * 〈一句话功能简述〉<br>
 * 〈内部类测试〉
 *
 * @author GuanBinChen
 * @create 2020/1/2
 * @since 1.0.0
 */
public class Test {

    public Test() {
        Inner s1 = new Inner();
        s1.a = 10;
        Inner s2 = new Inner();
        s2.a = 20;
        Test.Inner s3 = new Test.Inner();
        System.out.println("s3 = " + s3);
    }


    class Inner {
        public int a = 5;
    }


    public static void main(String[] args) {
        Test test = new Test();
        Inner inner = test.new Inner();
        System.out.println("inner = " + inner.a);
    }
}

