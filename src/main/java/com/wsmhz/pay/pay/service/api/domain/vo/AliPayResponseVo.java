package com.wsmhz.pay.pay.service.api.domain.vo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * Created By TangBiJing On 2019/4/2
 * Description:
 */
@Setter
@Getter
@Builder
public class AliPayResponseVo {

    private String orderNo;

    // 当前预下单请求生成的二维码码串，可以用二维码生成工具根据该码串值生成对应的二维码
    private String qrCode;
}
