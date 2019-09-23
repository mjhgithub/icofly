package com.mark.icohome.icopassenger.exception;

import com.mark.icohome.icocore.base.BaseResult;
import com.mark.icohome.icocore.exception.ErrorCodeEnum;
import com.mark.icohome.icocore.exception.NotFindException;
import com.mark.icohome.icocore.utils.ResultUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author mjh
 */

@ControllerAdvice
@Slf4j
public class RestExceptionHandler {
    /**
     * 运行时异常
     *
     * @param e
     * @return
     */
    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public <T> BaseResult<T> runtimeExceptionHandler(RuntimeException e) {
        if (e instanceof NotFindException) {
            return ResultUtils.error(ErrorCodeEnum.NOT_EXIST, e.getMessage());
        }
        return ResultUtils.error(ErrorCodeEnum.SERVICE_ERROR);
    }

}
