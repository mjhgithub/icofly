package com.mark.icohome.icocore.exception;

/**
 * @author mjh
 */

public class NotFindException extends RuntimeException {
    public NotFindException() {
        super("数据不存在");
    }
    public NotFindException(String message) {
        super(message);
    }
}
