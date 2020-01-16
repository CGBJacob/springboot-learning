/**
 * Copyright (C), 2015-2020, XXX有限公司
 * Author:   guanbinchen
 * Date:     2020/1/2 9:21
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jacob.test;

import com.jacob.Proxy.NetWork;
import com.jacob.Proxy.ProxyServer;
import com.jacob.Proxy.RealServer;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author GuanBinChen
 * @create 2020/1/2
 * @since 1.0.0
 */
public class TestAll {

//    public static void main(String[] args) {
//        Sub sub = new Sub();
//        System.out.println(sub.count);
//        sub.display();
//
//        Base base = new Base();
//        System.out.println(base.count);
//        base.display();
//
//
//        System.out.println(sub == base);

//        char[] arr1 = new char[]{'A', 'B', 'C'};
//
//        int[] arr2 = new int[]{1, 2, 3};
//
//        double[] arr3 = new double[]{1.12, 2.34, 6.12};
//
//
//        System.out.println("arr1 = " + arr1.toString());
//        System.out.println("arr2 = " + arr2);
//        System.out.println("arr3 = " + arr3);


//        Object o1 = true ? new Integer(1) : new Double(2.43);
//        Object o2;
//        if (true) {
//            o2 = new Integer(1);
//        } else {
//            o2 = new Double(2.43);
//        }
//        System.out.println("o2 = " + o2);
//        System.out.println("o1 = " + o1);

//        Integer i = new Integer(1);
//        Integer j = new Integer(1);
//
//        Integer m = 127;
//        Integer n = 127;
//        int jin = 1278;
//        System.out.println(m.equals(n));
//        System.out.println(m == n);

//         int id = 0;


//    }


//    class Something{
//        public static void main(String[] args) {
//            System.out.println("args = " + "111");
//        }
//    }


    public static void main(String[] args) {
        NetWork work = new ProxyServer(new RealServer());
        work.browse();
    }

}
