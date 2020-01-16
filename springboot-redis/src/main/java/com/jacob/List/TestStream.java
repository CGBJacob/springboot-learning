/**
 * Copyright (C), 2015-2019, XXX有限公司
 * Author:   guanbinchen
 * Date:     2019/12/31 10:06
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jacob.List;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author GuanBinChen
 * @create 2019/12/31
 * @since 1.0.0
 */
public class TestStream {
    public static void main(String[] args) {


        Map<String, Object> map = new HashMap<>();
        List<Object> list = new ArrayList<>();
        List<Object> listAll = new ArrayList<>();
        map.put("CARUNUM", "hahah");
        map.put("SIGNDATE", "FOLLOWREMARK");
        map.put("zjzUrl", "zjzUrl");
        map.put("CARUNUM", "zjzUrl");
        for (int i = 0; i < 3; i++) {
            Map<String, Object> mapObject = new HashMap<>();
            mapObject.put(i + "", i + 1 + "");
            list.add(mapObject);
        }
        map.put("data", list);
        listAll.add(map);
        Map<String, Object> mapData = new HashMap<>();
        mapData.put("rows", listAll);

        System.out.println("mapData = " + mapData);
    }
}
