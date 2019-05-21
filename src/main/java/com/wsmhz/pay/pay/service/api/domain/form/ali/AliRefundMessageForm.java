package com.wsmhz.pay.pay.service.api.domain.form.ali;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * Created By TangBiJing On 2019/4/4
 * Description: 支付宝退款成功消息内容
 */
@Getter
@Setter
@Builder
@ToString
public class AliRefundMessageForm {

    // 支付宝交易号
    private String tradeNo;

    // 商户订单号
    private String outTradeNo;

    // 用户的登录id
    private String buyerLogonId;

    // 本次退款是否发生了资金变化 Y/N
    private String fundChange;

    // 退款总金额
    private String refundFee;
//
//    // 退款币种信息
//    private String refundCurrency;

    // 退款支付时间 2014-11-27 15:45:57
    private Date gmtrRefundPay;

//    // 本次退款金额中买家退款金额
//    private String presentRefundBuyerAmount;
//
//    // 本次退款金额中平台优惠退款金额
//    private String presentRefundDiscountAmount;
//
//    // 本次退款金额中商家优惠退款金额
//    private String presentRefundMdiscountAmount;
}
