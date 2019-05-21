package com.wsmhz.pay.pay.service.api.api;

import com.wsmhz.pay.pay.service.api.domain.form.PayInfoInSertForm;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

/**
 * Created By TangBiJing On 2019/3/30
 * Description:
 */
@FeignClient(name = "pay-service")
public interface PayInfoApi {

    @PostMapping("/api/payInfo")
    int insertSelective(@RequestBody @Valid PayInfoInSertForm payInfoInSertForm);
}
