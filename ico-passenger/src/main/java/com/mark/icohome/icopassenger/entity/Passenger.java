package com.mark.icohome.icopassenger.entity;

import com.mark.icohome.icocore.entity.User;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotBlank;

/**
 * @author mjh
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
public class Passenger extends User {

    @NotBlank(message = "用户名不能为空")
    private String username;
    @NotBlank(message = "密码不能为空")
    private String password;
    @NotBlank(message = "手机号不能为空")
    private String phoneNumber;

}
