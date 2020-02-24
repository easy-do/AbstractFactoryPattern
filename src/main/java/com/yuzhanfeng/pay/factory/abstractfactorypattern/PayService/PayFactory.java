package com.yuzhanfeng.pay.factory.abstractfactorypattern.PayService;

import com.yuzhanfeng.pay.factory.abstractfactorypattern.PayService.crossborder.ICrossBorderPay;
import com.yuzhanfeng.pay.factory.abstractfactorypattern.PayService.territory.ITerritoryPay;

/**
 * Created by 于占峰 on 2020/2/24/024.
 * 抽象支付工厂
 */
public class PayFactory {
    public IPayFactory getPayFactory(String payType) {
        switch (payType){
            //境内支付
            case "1":
                return new ITerritoryPay();
            //境外支付
            case "2":
                return new ICrossBorderPay();
            default:
                return null;
        }
    }
}
