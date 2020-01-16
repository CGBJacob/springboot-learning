package com.jacob.test; /**
 * Copyright (C), 2015-2020, XXX有限公司
 * Author:   guanbinchen
 * Date:     2020/1/6 9:11
 * Description: 用户类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

import java.io.Serializable;

/**
 * 〈一句话功能简述〉<br>
 * 〈用户类〉
 *
 * @author GuanBinChen
 * @create 2020/1/6
 * @since 1.0.0
 */
public class Person implements Serializable {

    String userName;

    String id;

    String age;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Person(String userName, String id, String age) {
        this.userName = userName;
        this.id = id;
        this.age = age;
    }
}
