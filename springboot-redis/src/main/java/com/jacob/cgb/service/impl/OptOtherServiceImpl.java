package com.jacob.cgb.service.impl;

import com.jacob.cgb.service.IConsumerService;
import org.springframework.stereotype.Service;

@Service("optOtherService")
public class OptOtherServiceImpl implements IConsumerService {

    public void handlMessage(String msg) {
        System.out.println("SmsConsumerService msg=" + msg);
    }

}
