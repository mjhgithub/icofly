package com.mark.icohome.icocore.exception;

/**
 * @author mjh
 */

public class UserNotExistException extends NotExistException {
    public UserNotExistException() {
        super("用户不存在");
    }

    public UserNotExistException(String message) {
        super(message);
    }
}
