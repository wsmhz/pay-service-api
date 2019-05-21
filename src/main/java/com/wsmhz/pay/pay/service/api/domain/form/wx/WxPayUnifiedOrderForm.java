package com.wsmhz.pay.pay.service.api.domain.form.wx;

import com.wsmhz.pay.pay.service.api.domain.form.PayForm;
import lombok.*;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.List;

/**
 * Created By TangBiJing On 2019/4/2
 * Description:
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class WxPayUnifiedOrderForm extends PayForm {

    // 订单号（必填）
    @NotBlank(message = "订单编号不能为空")
    private String orderNo;

    // 支付金额（必填）
    @NotBlank(message = "订单支付金额不能为空")
    private String payment;

    // 服务器主动通知商户服务器里指定的回调地址
    @NotBlank(message = "回调地址不能为空")
    private String notifyUrl;

    // 交易类型 JSAPI--JSAPI支付（或小程序支付）、NATIVE--Native支付、APP--app支付，MWEB--H5支付
    @NotBlank(message = "交易类型不能为空")
    private String tradeType;

    @NotEmpty(message = "订单的商品条目不能为空")
    @Valid
    private List<WxOrderItemForm> orderItemList;

    // 设备号 自定义参数，可以为终端设备号(门店号或收银设备ID)，PC网页或公众号内支付可以传"WEB"
    private String deviceInfo = "WEB";

    // 货币类型
    private String feeType = "CNY";

    // 商品ID trade_type=NATIVE时，此参数必传。此参数为二维码中包含的商品ID，如果存在多个商品，请自行生成一个id
    private String productId;

    // 用户标识 trade_type=JSAPI时（即JSAPI支付），此参数必传，此参数为微信用户在商户对应appid下的唯一标识。openid如何获取，可参考【获取openid】。企业号请使用【企业号OAuth2.0接口】获取企业号内成员userid，再调用【企业号userid转openid接口】进行转换
    private String openId;

    @Builder
    public WxPayUnifiedOrderForm(@NotBlank(message = "发起请求的业务系统不能为空") String businessSystemName, @NotBlank(message = "支付平台不能为空") String platform, @NotBlank(message = "订单编号不能为空") String orderNo, @NotBlank(message = "订单支付金额不能为空") String payment, @NotBlank(message = "回调地址不能为空") String notifyUrl, @NotBlank(message = "交易类型不能为空") String tradeType, @NotEmpty(message = "订单的商品条目不能为空") @Valid List<WxOrderItemForm> orderItemList, String deviceInfo, String feeType, String productId, String openId) {
        super(businessSystemName, platform);
        this.orderNo = orderNo;
        this.payment = payment;
        this.notifyUrl = notifyUrl;
        this.tradeType = tradeType;
        this.orderItemList = orderItemList;
        this.deviceInfo = deviceInfo;
        this.feeType = feeType;
        this.productId = productId;
        this.openId = openId;
    }
}
