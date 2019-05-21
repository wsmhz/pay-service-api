package com.wsmhz.pay.pay.service.api.api;

import com.wsmhz.pay.pay.service.api.domain.form.ali.AliPayPrecreateForm;
import com.wsmhz.pay.pay.service.api.domain.form.ali.AliRefundForm;
import com.wsmhz.pay.pay.service.api.domain.form.wx.WxPayUnifiedOrderForm;
import com.wsmhz.pay.pay.service.api.domain.form.wx.WxRefundForm;
import com.wsmhz.pay.pay.service.api.domain.vo.AliPayCheckSignResponseVo;
import com.wsmhz.pay.pay.service.api.domain.vo.AliPayResponseVo;
import com.wsmhz.pay.pay.service.api.domain.vo.WxPayResponseVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.Map;

/**
 * Created By TangBiJing On 2019/3/30
 * Description:
 */
@FeignClient(name = "pay-service")
public interface PayServiceApi {

    // ***************** 支付宝 *************************

    @PostMapping("/ali/pay/precreate")
    AliPayResponseVo aliPayPrecreate(@RequestBody @Valid AliPayPrecreateForm aliPayPrecreateForm);

    @PostMapping("/ali/refund")
    boolean aliRefund(@RequestBody @Valid AliRefundForm aliRefundForm);

    @PostMapping("/ali/pay/checkSign")
    AliPayCheckSignResponseVo aliPayCheckSign(@RequestBody Map<String,String> params);

    // ***************** 微信 *************************

    @PostMapping("/wx/pay/precreate")
    WxPayResponseVo wxPayUnifiedOrder(@RequestBody @Valid WxPayUnifiedOrderForm wxPayUnifiedOrderForm);

    @PostMapping("/wx/refund")
    boolean wxRefund(@RequestBody @Valid WxRefundForm wxRefundForm);
}
