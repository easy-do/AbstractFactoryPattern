package com.yuzhanfeng.pay.factory.abstractfactorypattern.PayService.crossborder.AppleVaerification;

/**
 * Created by 于占峰 on 2020/2/24/024.
 */
public class AppleFaceVerification implements IApplePayPwType {
    @Override
    public boolean verification(String payPwType) {
        System.out.println("面部验证通过");
        return true;
    }
}
