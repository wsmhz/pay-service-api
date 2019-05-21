package com.wsmhz.pay.pay.service.api.domain.form;

import lombok.*;

import javax.validation.constraints.NotBlank;

/**
 * Created By TangBiJing On 2019/3/30
 * Description: 基础支付包装类
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PayForm {

    /**
     * 发起请求的业务系统
     */
    @NotBlank(message = "发起请求的业务系统不能为空")
    private String businessSystemName;
    /**
     * 支付的平台
     */
    @NotBlank(message = "支付平台不能为空")
    private String platform;
}
