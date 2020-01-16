/**
 * Copyright (C), 2015-2019, XXX有限公司
 * Author:   cheng
 * Date:     2019/12/17 8:47
 * Description: redis客户端启动类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jacob;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 〈一句话功能简述〉<br>
 * 〈redis客户端启动类〉
 *
 * @author GuanBinChen
 * @create 2019/12/17
 * @since 1.0.0
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }

}
