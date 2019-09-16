package com.mark.icohome.icoregister.controller;


import com.mark.icohome.icocore.base.BaseResult;
import com.mark.icohome.icocore.utils.ResultUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author mjh
 */
@Slf4j
@RestController
@RequestMapping("/health")
public class HealthController {

    @RequestMapping("/check")
    public BaseResult<Object> healthCheck() {
        return ResultUtils.genSuccesResult();
    }

}
