package com.mark.icohome.icocore.base;

/**
 * @author mjh
 */

public class BaseResult<T> {

    public static final int SUCCESS_CODE = 200;

    private boolean success;

    private int code;

    private String message;

    private T data;

    long timestamp;

    public BaseResult() {
        super();
    }

    public BaseResult(boolean success, int code, String message) {
        super();
        this.success = success;
        this.code = code;
        this.message = message;
    }

    public BaseResult(boolean success, int code, String message, T data) {
        super();
        this.success = success;
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }


}
