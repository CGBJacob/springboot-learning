/**
 * Copyright (C), 2015-2019, XXX有限公司
 * Author:   guanbinchen
 * Date:     2019/12/31 16:33
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jacob.List;

import com.alibaba.fastjson.JSONObject;

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
public class TestDemo {

    public static void main(String[] args) {
        String carNum = "车号";
        String SIGNDATE = "2019-12-31 15:42:12";
        String followRemark = "跟车资料";
        String zjzUrl = "11";
        String peopleUrl = "peopleUrl";
        String signUrl = "signUrl";
        List<Object> selectGridContentData = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            Map<String, Object> map = new HashMap<>();
            map.put("DELIVERYTIME", "DELIVERYTIME");
            map.put("EWBEZ", "EWBEZ");
            map.put("NAME1", "NAME1");
            map.put("VBELN", "VBELN");
            selectGridContentData.add(map);
        }

        Map<String, Object> map = new HashMap<>();
        map.put("CARNUM", carNum);
        map.put("SIGNDATE", SIGNDATE);
        map.put("FOLLOWREMARK", followRemark);
        map.put("zjzUrl", zjzUrl);
        map.put("peopleUrl", peopleUrl);
        map.put("signUrl", signUrl);
        List<Object> listAll = new ArrayList<>();
        for (Object datum : selectGridContentData) {
            Map objectMap = JSONObject.parseObject(JSONObject.toJSONString(datum), Map.class);
            List<Object> list = new ArrayList<>();
            Map<String, Object> data = new HashMap<>();
            Map<String, Object> datumData = new HashMap<>();
            data.put("DELIVERYTIME", objectMap.get("DELIVERYTIME"));
            data.put("EWBEZ", objectMap.get("EWBEZ"));
            data.put("NAME1", objectMap.get("NAME1"));
            data.put("VBELN", objectMap.get("VBELN"));
            list.add(data);
            datumData.put("data", list);
            datumData.put("TOTAL", "");
            datumData.put("TYPE", "");
            listAll.add(datumData);
        }
        map.put("selectGridContentData", listAll);
        List<Object> allData = new ArrayList<>();
        allData.add(map);
        Map<String, Object> mapData = new HashMap<>();
        mapData.put("rows", allData);

        System.out.println("mapData = " + mapData);
    }
}
