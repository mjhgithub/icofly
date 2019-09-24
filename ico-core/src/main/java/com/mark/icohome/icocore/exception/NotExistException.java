package com.mark.icohome.icocore.exception;

/**
 * @author mjh
 */

public class NotExistException extends RuntimeException {
    public NotExistException() {
        super("数据不存在");
    }
    public NotExistException(String message) {
        super(message);
    }
}
