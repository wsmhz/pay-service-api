package com.wsmhz.pay.pay.service.api.domain.form.ali;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * Created By TangBiJing On 2019/4/4
 * Description:
 */
@Setter
@Getter
@Builder
@ToString
public class AliPaySuccessMessageForm {

    // 支付宝交易凭证号
    private String tradeNo;

    // 原支付请求的商户订单号
    private String outTradeNo;

    // 买家支付宝账号对应的支付宝唯一用户号。以2088开头的纯16位数字
    private String buyerId;

    // 买家支付宝账号
    private String buyerLogonId;

    // 交易目前所处的状态
    // WAIT_BUYER_PAY	交易创建，等待买家付款     TRADE_CLOSED  未付款交易超时关闭，或支付完成后全额退款
    // TRADE_SUCCESS	交易支付成功      TRADE_FINISHED	交易结束，不可退款
    private String tradeStatus;

    // 本次交易支付的订单金额，单位为人民币（元）
    private String totalAmount;

    // 用户在交易中支付的金额
    private String buyerPayAmount;

    // 退款通知中，返回总退款金额，单位为元，支持两位小数
    private String refundFee;

    // 商户实际退款给用户的金额，单位为元，支持两位小数
    private String sendBackFee;

    // 商品的标题/交易标题/订单标题/订单关键字等，是请求时对应的参数，原样通知回来
    private String subject;

    // 该订单的备注、描述、明细等。对应请求时的body参数，原样通知回来
    private String body;

    // 该笔交易的买家付款时间
    private String gmtPayment;
}
