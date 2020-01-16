/**
 * Copyright (C), 2015-2020, XXX有限公司
 * Author:   guanbinchen
 * Date:     2020/1/7 10:08
 * Description: 发送邮件测试
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jacob.test;

import org.junit.Test;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

/**
 * 〈一句话功能简述〉<br>
 * 〈发送邮件测试〉
 *
 * @author GuanBinChen
 * @create 2020/1/7
 * @since 1.0.0
 */
public class TestSms {

    @Test
    public void testSms() throws Exception {

        String fromUser = "chenguanbin1616@gmail.com";


        String toUser = "huangziqing0303@gmail.com";


        String host = "192.169.0.149";

        //获取系统属性
        Properties properties = System.getProperties();

        //设置邮件服务器
        properties.setProperty("mail.smtp.host", host);

        //获取默认session对象
        Session session = Session.getDefaultInstance(properties);

        //创建MimeMessage对象
        MimeMessage message = new MimeMessage(session);

        //设置发件人头部字段
        message.setFrom(new InternetAddress(fromUser));

        //设置收件人头部字段
        message.addRecipient(Message.RecipientType.TO, new InternetAddress(toUser));

        //设置subject头部字段
        message.setSubject("this is a subject line");

        //设置消息体
        message.setText("This is actual message");

        Transport.send(message);
        //邮件发送成功
        System.out.println("send message successfully");
    }
}
