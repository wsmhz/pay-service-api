package com.wsmhz.pay.pay.service.api.domain.form.wx;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * Created By TangBiJing On 2019/4/4
 * Description: 微信退款成功消息内容
 */
@Setter
@Getter
@Builder
public class WxRefundMessageForm {

    // 微信订单号
    private String transactionId;

    // 商户系统内部的订单号
    private String outTradeNo;

    // 微信退款单号
    private String refundId;

    // 商户退款单号
    private String outRefundNo;

    // 订单总金额，单位为分，只能为整数
    private String totalFee;

    // 退款总金额,单位为分
    private String refundFee;

    // SUCCESS-退款成功 CHANGE-退款异常 REFUNDCLOSE—退款关闭
    private String refundStatus;

    // 资金退款至用户帐号的时间，格式2017-12-15 09:46:01
    private String successTime;

    // 退款入账账户，取当前退款单的退款入账方
    // 1）退回银行卡：{银行名称}{卡类型}{卡尾号}
    // 2）退回支付用户零钱: 支付用户零钱
    // 3）退还商户: 商户基本账户 商户结算银行账户
    // 4）退回支付用户零钱通: 支付用户零钱通
    private String refundRecvAccout;

    // 退款资金来源
    // REFUND_SOURCE_RECHARGE_FUNDS 可用余额退款/基本账户
    // REFUND_SOURCE_UNSETTLED_FUNDS 未结算资金退款
    private String refundAccount;

    // 退款发起来源
    // API接口
    // VENDOR_PLATFORM 商户平台
    private String refundQequestSource;
}
