package com.yuzhanfeng.pay.factory.abstractfactorypattern.PayService.territory;

import com.yuzhanfeng.pay.factory.abstractfactorypattern.PayService.territory.AlipayVerification.AliPayFaceVerification;
import com.yuzhanfeng.pay.factory.abstractfactorypattern.PayService.territory.WeChatVerification.WeChatPayFaceVerification;
import com.yuzhanfeng.pay.factory.abstractfactorypattern.PayService.territory.WeChatVerification.WeChatPayFingerprintVerification;

/**
 * Created by 于占峰 on 2020/2/24/024.
 */
public class WeChatPay extends ITerritoryPay {


    public String getPay(String orderNumber,Double payNumber,String payPwType) {
        boolean result = false;
        switch (payPwType){
            case "指纹":
                result = new WeChatPayFingerprintVerification().verification(payPwType);
                break;
            case "面部":
                result = new WeChatPayFaceVerification().verification(payPwType);
                break;
        }
        if (result){
            return "订单:"+orderNumber+",使用微信付款"+payNumber;
        }else{
            return "验证失败";
        }
    }
}
