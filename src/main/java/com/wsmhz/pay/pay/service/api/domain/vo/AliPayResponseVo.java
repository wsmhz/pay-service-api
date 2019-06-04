package com.wsmhz.pay.pay.service.api.domain.vo;

import lombok.*;

/**
 * Created By TangBiJing On 2019/4/2
 * Description:
 */
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AliPayResponseVo extends PayResponseVo{

    private String orderNo;

    // 当前预下单请求生成的二维码码串，可以用二维码生成工具根据该码串值生成对应的二维码
    private String qrCode;

    @Builder
    public AliPayResponseVo(String platform, String orderNo, String qrCode) {
        super(platform);
        this.orderNo = orderNo;
        this.qrCode = qrCode;
    }
}
