package com.yuzhanfeng.pay.factory.abstractfactorypattern.PayService.territory.WeChatVerification;

import com.yuzhanfeng.pay.factory.abstractfactorypattern.PayService.territory.AlipayVerification.IAliPayPwType;

/**
 * Created by 于占峰 on 2020/2/24/024.
 */
public class WeChatPayFaceVerification implements IWeChatPayPwType {
    @Override
    public boolean verification(String payPwType) {
        System.out.println("面部验证通过");
        return true;
    }
}
