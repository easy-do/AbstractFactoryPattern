package com.yuzhanfeng.pay.factory.abstractfactorypattern.PayService;

import com.yuzhanfeng.pay.factory.abstractfactorypattern.PayService.crossborder.ApplePay;
import com.yuzhanfeng.pay.factory.abstractfactorypattern.PayService.crossborder.ICrossBorderPay;
import com.yuzhanfeng.pay.factory.abstractfactorypattern.PayService.territory.AliPay;
import com.yuzhanfeng.pay.factory.abstractfactorypattern.PayService.territory.ITerritoryPay;
import com.yuzhanfeng.pay.factory.abstractfactorypattern.PayService.territory.WeChatPay;

/**
 * Created by 于占峰 on 2020/2/24/024.
 */
public class test {
    public static void main(String[] args) {
        //v1.0

/*        ICrossBorderPay iCrossBorderPay = new ApplePay();
        String PayResult = iCrossBorderPay.createPay();
        System.out.println(PayResult);

        ITerritoryPay iTerritoryPay = new AliPay();
        String PayResult1 = iTerritoryPay.createPay();
        System.out.println(PayResult1);

        ITerritoryPay iTerritoryPay2 = new WeChatPay();
        String PayResult2 = iTerritoryPay2.createPay();
        System.out.println(PayResult2);*/

        //V2.0

        PayFactory payFactory = new PayFactory();
        IPayFactory iPayFactory = payFactory.getPayFactory("1");
        String PayResult = iPayFactory.getPay("AliPay","123456787",
                1888.8,"指纹");
        System.out.println(PayResult);

        //3.0

    }
}
