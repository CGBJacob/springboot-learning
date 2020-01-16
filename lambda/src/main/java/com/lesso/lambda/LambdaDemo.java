/**
 * Copyright (C), 2015-2020, XXX有限公司
 * Author:   guanbinchen
 * Date:     2020/1/16 10:02
 * Description: 测试Lambda
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.lesso.lambda;

import com.lesso.lambda.service.Person;

import java.util.Optional;

/**
 * 〈一句话功能简述〉<br>
 * 〈测试Lambda〉
 *
 * @author GuanBinChen
 * @create 2020/1/16
 * @since 1.0.0
 */
public class LambdaDemo {


    public static void main(String[] args) {
        Person person = new Person();

    }


    public String test() {
        Person person = new Person();
        Optional<Person> optional = Optional.ofNullable(person);
//        optional.ifPresent(System.out::println);


        return optional.map(p -> p.getFirstName()).map(name -> name.toUpperCase()).orElse(null);
    }


}
