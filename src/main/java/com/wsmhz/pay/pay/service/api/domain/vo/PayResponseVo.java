package com.wsmhz.pay.pay.service.api.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created By tangbj On 2019/6/4
 * Description:
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PayResponseVo {
    /**
     * 支付的平台
     */
    private String platform;
}
