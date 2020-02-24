package com.yuzhanfeng.pay.factory.abstractfactorypattern.PayService.crossborder.AppleVaerification;

/**
 * Created by 于占峰 on 2020/2/24/024.
 */
public class AppleFingerprintVerification implements IApplePayPwType {
    @Override
    public boolean verification(String payPwType) {
        System.out.println("指纹验证通过");
        return true;
    }
}
