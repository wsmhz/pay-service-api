package com.wsmhz.pay.pay.service.api.domain.form.ali;

import com.wsmhz.pay.pay.service.api.domain.form.OrderItemForm;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * Created By TangBiJing On 2019/4/15
 * Description:
 */
@Setter
@Getter
public class AliOrderItemFrom extends OrderItemForm {

    @Builder
    public AliOrderItemFrom(@NotBlank(message = "商品id不能为空") String productId, @NotBlank(message = "商品名称不能为空") String productName, @NotNull(message = "商品数量不能为空") int quantity, @NotBlank(message = "商品价格不能为空") String price, String productCategory, String body, String productUrl) {
        super(productId, productName, quantity, price, productCategory, body, productUrl);
    }
}
