package com.mark.icohome.icopassenger.exception;

import com.mark.icohome.icocore.base.BaseResult;
import com.mark.icohome.icocore.exception.ErrorCodeEnum;
import com.mark.icohome.icocore.exception.NotExistException;
import com.mark.icohome.icocore.utils.ResultUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
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
        return ResultUtils.error(ErrorCodeEnum.SERVICE_ERROR);
    }

    @ExceptionHandler(NotExistException.class)
    @ResponseBody
    public <T> BaseResult<T> userNotExistExceptionHandler(NotExistException e) {
        return ResultUtils.error(ErrorCodeEnum.NOT_EXIST, e.getMessage());
    }

    /**
     * 非法参数异常
     *
     * @param ex
     * @return
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    public <T> BaseResult<T> illegalParamsExceptionHandler(MethodArgumentNotValidException ex) {
        log.error("[RestExceptionHandler] -----> illegalParamsExceptionHandler", ex);
        //按需重新封装需要返回的错误信息
        StringBuffer sb = new StringBuffer();
        //解析原错误信息，封装后返回，此处返回非法的字段名称，原始值，错误信息
        for (FieldError error : ex.getBindingResult().getFieldErrors()) {
            sb.append(error.getField()).append("->");
            sb.append(error.getDefaultMessage());
            sb.append("; ");
        }
        return ResultUtils.error(ErrorCodeEnum.ILLEGAL_PARAM, sb.toString());
    }

}
