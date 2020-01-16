/**
 * Copyright (C), 2015-2020, XXX有限公司
 * Author:   guanbinchen
 * Date:     2020/1/6 9:06
 * Description: 序列化测试
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jacob.test;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 〈一句话功能简述〉<br>
 * 〈序列化测试〉
 *
 * @author GuanBinChen
 * @create 2020/1/6
 * @since 1.0.0
 */
public class TestSerializable {


    public static void main(String[] args) throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("out.dat"));

        Person person = new Person("张三", "10086", "18");
        oos.writeObject(person);
        oos.flush();
        oos.close();
    }

    @Test
    public void test01() throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\Workspace\\workspace-idea-notes\\springboot-learning\\out.dat"));
        Person person = (Person) ois.readObject();
        System.out.println("用户的id：" + person.id + "用户的名称：" + person.userName + "用户的年纪：" + person.age);
    }
}
