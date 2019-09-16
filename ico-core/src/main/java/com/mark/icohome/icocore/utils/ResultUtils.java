package com.mark.icohome.icocore.utils;


import com.mark.icohome.icocore.base.BaseResult;
import lombok.extern.slf4j.Slf4j;

/**
 * 响应结果工具类
 *
 * @author mjh
 */
@Slf4j
public class ResultUtils {
    public static final boolean SUCCESS = true;
    public static final boolean ERROR = false;

    public static final int SUCCESS_CODE = 200;

    public static final String SUCCESS_MSG = "操作成功";

    public static <T> BaseResult<T> genResult(boolean success, int code, String message, T data) {

        BaseResult<T> result = new BaseResult();

        result.setSuccess(success);
        result.setCode(code);
        result.setMessage(message);
        result.setData(data);
        result.setTimestamp(System.currentTimeMillis());

        if (log.isDebugEnabled()) {
            log.debug("generate result:{}", result);
        }

        return result;
    }

    public static <T> BaseResult<T> genSuccesResult() {
        return genResult(SUCCESS, SUCCESS_CODE, SUCCESS_MSG, null);
    }

    public static <T> BaseResult<T> genSuccesResult(T data) {
        return genResult(SUCCESS, SUCCESS_CODE, SUCCESS_MSG, data);
    }

    public static <T> BaseResult<T> genSuccesResult(String message, T data) {
        return genResult(SUCCESS, SUCCESS_CODE, message, data);
    }

    public static <T> BaseResult<T> genErrorResult(String msg, int code) {
        return genResult(ERROR, code, msg, null);
    }


}
