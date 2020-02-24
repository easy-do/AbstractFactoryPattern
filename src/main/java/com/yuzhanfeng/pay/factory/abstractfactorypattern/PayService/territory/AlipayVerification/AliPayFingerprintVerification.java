package com.yuzhanfeng.pay.factory.abstractfactorypattern.PayService.territory.AlipayVerification;

/**
 * Created by 于占峰 on 2020/2/24/024.
 */
public class AliPayFingerprintVerification implements IAliPayPwType {
    @Override
    public boolean verification(String payPwType) {
        System.out.println("指纹验证通过");
        return true;
    }
}
