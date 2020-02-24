package com.yuzhanfeng.pay.factory.abstractfactorypattern.PayService.territory;

import com.yuzhanfeng.pay.factory.abstractfactorypattern.PayService.IPayFactory;


/**
 * Created by 于占峰 on 2020/2/24/024.
 * 境内支付工厂
 */
public class ITerritoryPay implements IPayFactory {


    @Override
    public String getPay(String payName,String orderNumber,Double payNumber,String payPwType) {
       switch (payName){
           case "AliPay":
               return new AliPay().getPay(orderNumber,payNumber,payPwType);
           case "WeChatPay":
               return new WeChatPay().getPay(orderNumber,payNumber,payPwType);
           default:
               return "不支持的支付类型";
       }
    }
}
