/**
 * Copyright (C), 2015-2020, XXX有限公司
 * Author:   guanbinchen
 * Date:     2020/1/3 15:37
 * Description: 季节
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jacob.demo;

/**
 * 〈一句话功能简述〉<br>
 * 〈季节〉
 *
 * @author GuanBinChen
 * @create 2020/1/3
 * @since 1.0.0
 */
public enum Season {


    SPRING("春天", "春心萌动"),

    SUMMER("夏天", "炎炎夏日"),

    AUTUMN("秋天", "秋高气爽"),

    WINTER("冬天", "冬日皑皑");

    private final String SEASONNAME;
    private final String SEASONDESC;


    private Season(String SEASONNAME, String SEASONDESC) {
        this.SEASONNAME = SEASONNAME;
        this.SEASONDESC = SEASONDESC;
    }


    public String getSEASONNAME() {
        return SEASONNAME;
    }

    public String getSEASONDESC() {
        return SEASONDESC;
    }
}
