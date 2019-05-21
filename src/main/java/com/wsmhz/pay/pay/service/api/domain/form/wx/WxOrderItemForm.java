package com.wsmhz.pay.pay.service.api.domain.form.wx;

import com.wsmhz.pay.pay.service.api.domain.form.OrderItemForm;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * Created By TangBiJing On 2019/4/2
 * Description:
 */
@Getter
@Setter
public class WxOrderItemForm extends OrderItemForm {
    // 名称	    变量名	    必填	类型	示例值	    描述
    // 商品编码	goods_id	是	String(32)	商品编码	由半角的大小写字母、数字、中划线、下划线中的一种或几种组成
    private String goodsId = "商品编码";

    @Builder
    public WxOrderItemForm(@NotBlank(message = "商品id不能为空") String productId, @NotBlank(message = "商品名称不能为空") String productName, @NotNull(message = "商品数量不能为空") int quantity, @NotBlank(message = "商品价格不能为空") String price, String productCategory, String body, String productUrl, String goodsId) {
        super(productId, productName, quantity, price, productCategory, body, productUrl);
        this.goodsId = goodsId;
    }
}
