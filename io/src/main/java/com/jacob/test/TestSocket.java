/**
 * Copyright (C), 2015-2020, XXX有限公司
 * Author:   guanbinchen
 * Date:     2020/1/7 9:18
 * Description: Socket编程
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jacob.test;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 〈一句话功能简述〉<br>
 * 〈Socket编程〉
 *
 * @author GuanBinChen
 * @create 2020/1/7
 * @since 1.0.0
 */
public class TestSocket {

    @Test
    public void client() throws Exception {

        //1.连接诶服务器
        Socket s = new Socket("127.0.0.1", 5612);
        System.out.println("已连接到服务器5612端口，准备传送图片...");
        //获取图片字节流
        FileInputStream fis = new FileInputStream("D:\\Workspace\\workspace-idea-notes\\springboot-learning\\CS.jpg");
        //获取输出流
        OutputStream out = s.getOutputStream();
        byte[] buf = new byte[1024];
        int len = 0;
        //2.往输出流里面投放数据
        while ((len = fis.read(buf)) != -1) {
            out.write(buf, 0, len);
        }
        //通知服务端，数据发送完毕
        s.shutdownOutput();
        //3.获取输出流，接受服务器传送过来的消息“上传成功”
        InputStream in = s.getInputStream();
        byte[] bufIn = new byte[1024];
//        int num = in.read(bufIn);
//        System.out.println(new String(bufIn, 0, num));
        int len1;
        while ((len1 = in.read(bufIn)) != -1) {
            System.out.println(new String(bufIn, 0, len));
        }
        //关闭资源
        fis.close();
        out.close();
        in.close();
        s.close();

    }


    @Test
    public void server() throws Exception {
        //1.服务器开始监听5612端口
        ServerSocket ss = new ServerSocket(5612);
        System.out.println("服务端已启动，正在监听5612端口...");
        //等待客户端
        Socket s = ss.accept();
        System.out.println("检测到客户端，准备数据接收...");
        //客户端已连接，获取输入流
        InputStream in = s.getInputStream();
        //创建图片字节流
        FileOutputStream fos = new FileOutputStream("D:\\Workspace\\workspace-idea-notes\\springboot-learning\\CS1.jpg");
        byte[] buf = new byte[in.available()];
        int len = 0;
        //往字节流里写图片数据
        while ((len = in.read(buf)) != -1) {
            fos.write(buf, 0, len);
        }
        //获取输出流，准备给客户端发送消息
        OutputStream out = s.getOutputStream();
        out.write("上传成功".getBytes());
        //关闭资源
        fos.close();
        in.close();
        out.close();
        s.close();
        ss.close();

    }
}
