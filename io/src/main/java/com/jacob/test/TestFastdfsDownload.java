/**
 * Copyright (C), 2015-2020, XXX有限公司
 * Author:   guanbinchen
 * Date:     2020/1/14 9:52
 * Description: 测试fastdfs下载
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jacob.test;

import org.junit.jupiter.api.Test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * 〈一句话功能简述〉<br>
 * 〈测试fastdfs下载〉
 *
 * @author GuanBinChen
 * @create 2020/1/14
 * @since 1.0.0
 */
public class TestFastdfsDownload {


    @Test
    public void download() throws Exception {
        String fileName = "C:\\Users\\cheng\\Pictures\\Camera Roll\\04baf3132151265b22a12b93f5f08933.jpg";
        String downName = "C:\\Users\\cheng\\AppData\\Roaming\\CC_4.0\\lessocc\\94167\\file\\test1.jpg";
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(fileName));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(downName));


        int len = 0;
        while ((len = bis.read()) != -1) {
            bos.write( len);
        }
        bos.flush();

        bos.close();
        bis.close();
    }
}
