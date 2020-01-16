/**
 * Copyright (C), 2015-2019, XXX有限公司
 * Author:   cheng
 * Date:     2019/12/26 9:01
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.test;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author GuanBinChen
 * @create 2019/12/26
 * @since 1.0.0
 */
public class Demo {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        List<String> list1 = new ArrayList<>();

        String mean1 = "ahahah";
        String mean2 = "ahahah";

        list.add(mean1);
        list.add(mean2);

        for (String s : list) {
            if ("ahahah".equals(s))
                list1.add("1");
        }
//
        String join = StringUtils.join(list1, ",");
        String s = join.toString();
//        join = join.substring(join.indexOf(","));
        System.out.println("join = " + join);
        System.out.println("s = " + s);
    }
}
