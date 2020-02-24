package com.yuzhanfeng.pay.factory.abstractfactorypattern.PayService;

import com.yuzhanfeng.pay.factory.abstractfactorypattern.PayService.crossborder.ApplePay;

/**
 * Created by 于占峰 on 2020/2/24/024.
 * 支付接口
 */
public interface  IPayFactory {

    public String getPay(String payName,String orderNumber,Double payNumber,String payPwType);
}
