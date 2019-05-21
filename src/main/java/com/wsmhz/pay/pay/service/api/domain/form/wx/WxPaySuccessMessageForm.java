package com.wsmhz.pay.pay.service.api.domain.form.wx;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * Created By TangBiJing On 2019/4/4
 * Description: 微信支付成功消息内容
 */
@Setter
@Getter
@Builder
public class WxPaySuccessMessageForm {

    // 微信支付分配的终端设备号
    private String deviceInfo;

    // 用户在商户appId下的唯一标识
    private String openId;

    // 用户是否关注公众账号，Y-关注，N-未关注
    private String subscribe;

    // JSAPI、NATIVE、APP
    private String tradeType;

    // 银行类型，采用字符串类型的银行标识，银行类型见银行列表 https://pay.weixin.qq.com/wiki/doc/api/native.php?chapter=4_2
    private String bankType;

    // 订单总金额，单位为分
    private String totalFee;

    // 应结订单金额=订单金额-非充值代金券金额，应结订单金额<=订单金额
    private String settlementTotalFee;

    // 货币类型，符合ISO4217标准的三位字母代码，默认人民币：CNY
    private String feeType;

    // 微信支付订单号 1217752501201407033233368018
    private String transactionId;

    // 商户系统内部订单号，要求32个字符内，只能是数字、大小写字母_-|*@ ，且在同一个商户号下唯一。
    private String outTradeNo;

    // 商家附加的数据，原样返回
    private String attach;

    // 支付完成时间，格式为yyyyMMddHHmmss，如2009年12月25日9点10分10秒表示为20091225091010
    private String timeEnd;
}
