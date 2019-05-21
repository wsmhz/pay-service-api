package com.wsmhz.pay.pay.service.api.domain.form.wx;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created By TangBiJing On 2019/4/2
 * Description:
 */
@Setter
@Getter
@Builder
@ToString
public class WxRefundForm {

    // 商户系统内部订单号，要求32个字符内，只能是数字、大小写字母_-|*@ ，且在同一个商户号下唯一
    private String outTradeNo;

    // 商户系统内部的退款单号，商户系统内部唯一，只能是数字、大小写字母_-|*@ ，同一退款单号多次请求只退一笔。
    private String outRefundNo;

    // 订单总金额，单位为分，只能为整数
    private String totalFee;

    //  退款总金额，订单总金额，单位为分，只能为整数
    private String refundFee;

    // 退款货币类型，需与支付一致，或者不填。符合ISO 4217标准的三位字母代码，默认人民币：CNY
    private String refundFeeType;

    // 若商户传入，会在下发给用户的退款消息中体现退款原因
    private String refundDesc;

    // 退款资金来源
    // REFUND_SOURCE_RECHARGE_FUNDS 可用余额退款/基本账户
    // REFUND_SOURCE_UNSETTLED_FUNDS 未结算资金退款
    private String refundAccount;

    // 异步接收微信支付退款结果通知的回调地址，通知URL必须为外网可访问的url，不允许带参数
    //如果参数中传了notify_url，则商户平台上配置的回调地址将不会生效
    private String notifyUrl;
}
