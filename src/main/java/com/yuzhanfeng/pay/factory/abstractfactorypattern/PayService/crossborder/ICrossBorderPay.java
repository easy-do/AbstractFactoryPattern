package com.yuzhanfeng.pay.factory.abstractfactorypattern.PayService.crossborder;

import com.yuzhanfeng.pay.factory.abstractfactorypattern.PayService.IPayFactory;
import com.yuzhanfeng.pay.factory.abstractfactorypattern.PayService.crossborder.AppleVaerification.IApplePayPwType;
import com.yuzhanfeng.pay.factory.abstractfactorypattern.PayService.territory.AliPay;
import com.yuzhanfeng.pay.factory.abstractfactorypattern.PayService.territory.WeChatPay;

/**
 * Created by 于占峰 on 2020/2/24/024.
 * 跨境支付工厂接口
 */
public class ICrossBorderPay implements IPayFactory {


    @Override
    public String getPay(String payName,String orderNumber,Double payNumber,String payPwType) {

        switch (payName){
            case "ApplePay":
                return new ApplePay().getPay(orderNumber,payNumber,payPwType);
            default:
                return "不支持的支付类型";
        }
    }
}
