package com.yuzhanfeng.pay.factory.abstractfactorypattern.PayService.territory.WeChatVerification;

/**
 * Created by 于占峰 on 2020/2/24/024.
 * 支付验证接口
 */
public interface IWeChatPayPwType {
    public boolean verification(String payPwType);
}
