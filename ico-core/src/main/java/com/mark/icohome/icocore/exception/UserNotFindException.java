package com.mark.icohome.icocore.exception;

/**
 * @author mjh
 */

public class UserNotFindException extends NotFindException {
    public UserNotFindException() {
        super("用户不存在");
    }
}
