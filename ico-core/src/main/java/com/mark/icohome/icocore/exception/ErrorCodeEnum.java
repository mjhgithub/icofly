package com.mark.icohome.icocore.exception;

/**
 * @author mjh
 */

public enum ErrorCodeEnum {

    NOT_EXIST(4004, "数据不存在"),
    ILLEGAL_PARAM(4005, "非法参数"),
    SERVICE_ERROR(5001, "服务异常");

    private int code;

    private String msg;

    ErrorCodeEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
