/**
 * Copyright (C), 2015-2019, XXX有限公司
 * Author:   cheng
 * Date:     2019/12/31 8:44
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jacob.cgb.service.impl;

import com.jacob.cgb.service.IConsumerService;
import org.springframework.stereotype.Service;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author GuanBinChen
 * @create 2019/12/31
 * @since 1.0.0
 */
@Service("emailConsumerService")
public class OptEmailConsumerServiceImpl implements IConsumerService {
    @Override
    public void handlMessage(String msg) {
        System.out.println("emailConsumerService msg=" + msg);
    }
}
