package com.wsmhz.pay.pay.service.api.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created By TangBiJing On 2019/5/17
 * Description:
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AliPayCheckSignResponseVo {

    private boolean checked;

    private String msg;
}
