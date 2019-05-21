package com.wsmhz.pay.pay.service.api.domain.form.ali;

import lombok.*;

import javax.validation.constraints.NotBlank;

/**
 * Created By TangBiJing On 2019/3/31
 * Description:
 */
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AliRefundForm {

    @NotBlank(message = "订单号不能为空")
    private String orderNo;

    @NotBlank(message = "退款金额不能为空")
    private String amount;

    @NotBlank(message = "退款原因不能为空")
    private String reason ;

    // (必填) 商户门店编号，退款情况下可以为商家后台提供退款权限判定和统计等作用，详询支付宝技术支持
    @Builder.Default
    private String storeId = "test_store_id";

    // (可选，需要支持重复退货时必填) 商户退款请求号，相同支付宝交易号下的不同退款请求号对应同一笔交易的不同退款申请，
    // 对于相同支付宝交易号下多笔相同商户退款请求号的退款交易，支付宝只会进行一次退款
    @Builder.Default
    private String outRequestNo = "";
}
