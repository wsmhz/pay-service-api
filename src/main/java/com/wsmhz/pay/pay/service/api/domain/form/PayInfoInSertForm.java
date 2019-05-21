package com.wsmhz.pay.pay.service.api.domain.form;

import lombok.*;

import javax.validation.constraints.NotBlank;

/**
 * Created By TangBiJing On 2019/3/30
 * Description: 基础支付包装类
 */
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PayInfoInSertForm {

    private Long id;

    private Long userId;

    private Long orderNo;
    /**
     * 支付平台
     */
    private String payPlatform;
    /**
     * 流水号
     */
    private String platformNumber;
    /**
     * 平台订单状态
     */
    private String platformStatus;
}
