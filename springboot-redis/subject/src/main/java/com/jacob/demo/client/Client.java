package com.jacob.demo.client;

import com.jacob.demo.test.WxBlance;
import com.jacob.demo.test.WxTrade;
import com.jacob.demo.utils.DeductionFacade;

import java.math.BigDecimal;

/**
 * @author shuliangzhao
 * @Title: Client
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/5/29 0:10
 */
public class Client {

    public static void main(String[] args) {
        WxTrade wxTrade = new WxTrade();
        wxTrade.setTradeAmout(new BigDecimal("1000"));
        WxBlance wxBlance = new WxBlance();
        wxBlance.setBlance(new BigDecimal("2000"));
        DeductionFacade.deduct(wxBlance,wxTrade);
        System.out.println(wxTrade.getUserAmout());
    }
}