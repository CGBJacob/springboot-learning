/**
 * Copyright (C), 2015-2019, XXX有限公司
 * Author:   cheng
 * Date:     2019/12/31 8:42
 * Description: 消费者接口
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jacob.cgb.service;

/**
 * 〈一句话功能简述〉<br>
 * 〈消费者接口〉
 *
 * @author GuanBinChen
 * @create 2019/12/31
 * @since 1.0.0
 */
public interface IConsumerService {

    /**
     * 处理消息服务接口
     *
     * @param msg
     */
    void handlMessage(String msg);
}
