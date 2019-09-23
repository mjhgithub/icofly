package com.mark.icohome.icocore.utils;


import com.mark.icohome.icocore.base.BaseResult;
import com.mark.icohome.icocore.exception.ErrorCodeEnum;
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

    public static <T> BaseResult<T> result(boolean success, int code, String msg, T data) {
        BaseResult<T> result = new BaseResult();
        result.setSuccess(success);
        result.setCode(code);
        result.setMessage(msg);
        result.setData(data);
        result.setTimestamp(System.currentTimeMillis());
        return result;
    }

    public static <T> BaseResult<T> success() {
        return result(SUCCESS, SUCCESS_CODE, SUCCESS_MSG, null);
    }

    public static <T> BaseResult<T> success(T data) {
        return result(SUCCESS, SUCCESS_CODE, SUCCESS_MSG, data);
    }

    public static <T> BaseResult<T> success(String msg, T data) {
        return result(SUCCESS, SUCCESS_CODE, msg, data);
    }

    public static <T> BaseResult<T> error(ErrorCodeEnum errorCodeEnum) {
        return result(ERROR, errorCodeEnum.getCode(), errorCodeEnum.getMsg(), null);
    }

    public static <T> BaseResult<T> error(ErrorCodeEnum errorCodeEnum, String msg) {
        return result(ERROR, errorCodeEnum.getCode(), msg, null);
    }

    public static <T> BaseResult<T> error(int code, String msg) {
        return result(ERROR, code, msg, null);
    }

}
