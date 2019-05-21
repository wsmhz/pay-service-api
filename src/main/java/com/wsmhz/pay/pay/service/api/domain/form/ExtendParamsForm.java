package com.wsmhz.pay.pay.service.api.domain.form;

import lombok.*;

/**
 * Created By TangBiJing On 2019/3/30
 * Description:
 */
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ExtendParamsForm {

    // 系统商编号
    private String sysServiceProviderId;
}
