package com.mark.icohome.icodriver.controller;

import com.mark.icohome.icocore.base.BaseResult;
import com.mark.icohome.icocore.utils.ResultUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mjh
 */

@Slf4j
@RestController
@RequestMapping("/api/driver")
public class IndexController {

    @RequestMapping("/index")
    public BaseResult<Object> index() {
        return ResultUtils.success("driver");
    }
}
