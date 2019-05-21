package com.wsmhz.pay.pay.service.api.domain.form;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * Created By TangBiJing On 2019/3/30
 * Description: 订单条目明细
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class OrderItemForm {

    // 商品id（必填）
    @NotBlank(message = "商品id不能为空")
    private String productId;

    // 商品名称（必填）
    @NotBlank(message = "商品名称不能为空")
    private String productName;

    // 商品数量（必填）
    @NotNull(message = "商品数量不能为空")
    private int quantity;

    // 商品价格（必填），单位为分 单位为分 单位为分
    @NotBlank(message = "商品价格不能为空")
    private String price;

    // 商品类别（可选）
    private String productCategory;

    // 商品详情描述（可选）
    private String body;

    // 完整的http链接（可选）
    private String productUrl;
}
