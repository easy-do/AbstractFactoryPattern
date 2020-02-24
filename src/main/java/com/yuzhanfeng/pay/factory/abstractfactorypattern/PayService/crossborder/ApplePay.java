package com.yuzhanfeng.pay.factory.abstractfactorypattern.PayService.crossborder;

import com.yuzhanfeng.pay.factory.abstractfactorypattern.PayService.crossborder.AppleVaerification.AppleFaceVerification;
import com.yuzhanfeng.pay.factory.abstractfactorypattern.PayService.crossborder.AppleVaerification.AppleFingerprintVerification;
import com.yuzhanfeng.pay.factory.abstractfactorypattern.PayService.crossborder.AppleVaerification.IApplePayPwType;
import com.yuzhanfeng.pay.factory.abstractfactorypattern.PayService.territory.ITerritoryPay;

/**
 * Created by 于占峰 on 2020/2/24/024.
 */
public class ApplePay {
    public String getPay(String orderNumber,Double payNumber,String payPwType){
        boolean result = false;
        switch (payPwType){
            case "指纹":
                result = new AppleFingerprintVerification().verification(payPwType);
                break;
            case "面部":
                result = new AppleFaceVerification().verification(payPwType);
                break;
        }
        if (result){
            return "订单:"+orderNumber+",使用Apple付款"+payNumber;
        }else{
            return "验证失败";
        }
    }

}
