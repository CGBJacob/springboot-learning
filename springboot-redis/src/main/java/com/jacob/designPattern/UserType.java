/**
 * Copyright (C), 2015-2019, XXX有限公司
 * Author:   cheng
 * Date:     2019/12/30 15:35
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jacob.designPattern;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author GuanBinChen
 * @create 2019/12/30
 * @since 1.0.0
 */

public enum UserType {
    SILVER_VIP(200), GOLD_VIP(500), PLATINUM_VIP(1000), SILVER(100);

    private int code;

    UserType(int i) {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }


    @Override
    public String toString() {
        return "UserType{" +
                "code=" + code +
                '}';
    }
}
