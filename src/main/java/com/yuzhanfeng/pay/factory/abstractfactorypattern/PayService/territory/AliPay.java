package com.yuzhanfeng.pay.factory.abstractfactorypattern.PayService.territory;

import com.yuzhanfeng.pay.factory.abstractfactorypattern.PayService.crossborder.AppleVaerification.AppleFaceVerification;
import com.yuzhanfeng.pay.factory.abstractfactorypattern.PayService.crossborder.AppleVaerification.AppleFingerprintVerification;
import com.yuzhanfeng.pay.factory.abstractfactorypattern.PayService.territory.AlipayVerification.AliPayFaceVerification;
import com.yuzhanfeng.pay.factory.abstractfactorypattern.PayService.territory.AlipayVerification.AliPayFingerprintVerification;

/**
 * Created by 于占峰 on 2020/2/24/024.
 */
public class AliPay extends ITerritoryPay {



    public String getPay(String orderNumber,Double payNumber,String payPwType) {
        boolean result = false;
        switch (payPwType){
            case "指纹":
                result = new AliPayFingerprintVerification().verification(payPwType);
                break;
            case "面部":
                result = new AliPayFaceVerification().verification(payPwType);
                break;

        }
        if (result){
            return "订单:"+orderNumber+",使用支付宝付款"+payNumber;
        }else{
            return "验证失败";
        }
    }
}
