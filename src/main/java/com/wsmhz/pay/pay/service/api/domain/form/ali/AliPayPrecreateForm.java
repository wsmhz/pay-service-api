package com.wsmhz.pay.pay.service.api.domain.form.ali;

import com.wsmhz.pay.pay.service.api.domain.form.ExtendParamsForm;
import com.wsmhz.pay.pay.service.api.domain.form.PayForm;
import lombok.*;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.List;

/**
 * Created By TangBiJing On 2019/3/30
 * Description: 支付宝当面付 二维码支付 业务参数封装
 */
@Setter
@Getter
@NoArgsConstructor
@ToString
public class AliPayPrecreateForm extends PayForm {

    // 订单号（必填）
    @NotBlank(message = "订单编号不能为空")
    private String orderNo;

    // 支付金额（必填）
    @NotBlank(message = "订单支付金额不能为空")
    private String payment;

    //支付宝服务器主动通知商户服务器里指定的回调地址
    @NotBlank(message = "回调地址不能为空")
    private String notifyUrl;

    @NotEmpty(message = "订单的商品条目不能为空")
    @Valid
    private List<AliOrderItemFrom> orderItemList;

    // 订单不可打折金额，此处单位为元，精确到小数点后2位，可以配合商家平台配置折扣活动，如果酒水不参与打折，则将对应金额填写至此字段
    // 如果该值未传入,但传入了【订单总金额】,【打折金额】,则该值默认为【订单总金额】-【打折金额】
    private String undiscountableAmount = "0";

    // 卖家支付宝账号ID，用于支持一个签约账号下支持打款到不同的收款账号，(打款到sellerId对应的支付宝账号)
    // 如果该字段为空，则默认为与支付宝签约的商户的PID，也就是appid对应的PID
    private String sellerId = "";

    // 商户操作员编号，添加此参数可以为商户操作员做销售统计
    private String operatorId = "test_operator_id";

    // (必填) 商户门店编号，通过门店号和商家后台可以配置精准到门店的折扣信息，详询支付宝技术支持
    private String storeId = "test_store_id";

    // 支付超时时间，默认为120分钟
    private String timeoutExpress = "120m";

    // 业务扩展参数
    private ExtendParamsForm extendParamsForm;

    @Builder
    public AliPayPrecreateForm(@NotBlank(message = "发起请求的业务系统不能为空") String businessSystemName, @NotBlank(message = "支付平台不能为空") String platform, @NotBlank(message = "订单编号不能为空") String orderNo, @NotBlank(message = "订单支付金额不能为空") String payment, @NotBlank(message = "回调地址不能为空") String notifyUrl, @NotEmpty(message = "订单的商品条目不能为空") @Valid List<AliOrderItemFrom> orderItemList, String undiscountableAmount, String sellerId, String operatorId, String storeId, String timeoutExpress, ExtendParamsForm extendParamsForm) {
        super(businessSystemName, platform);
        this.orderNo = orderNo;
        this.payment = payment;
        this.notifyUrl = notifyUrl;
        this.orderItemList = orderItemList;
        this.undiscountableAmount = undiscountableAmount == null ? "0" : undiscountableAmount;
        this.sellerId = sellerId == null ? "" : sellerId;
        this.operatorId = operatorId == null ? "test_operator_id" : operatorId;
        this.storeId = storeId == null ? "test_store_id" : storeId;
        this.timeoutExpress = timeoutExpress == null ? "120m" : timeoutExpress;
        this.extendParamsForm = extendParamsForm;
    }
}
