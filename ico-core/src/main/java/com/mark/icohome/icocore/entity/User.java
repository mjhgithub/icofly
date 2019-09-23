package com.mark.icohome.icocore.entity;

import com.mark.icohome.icocore.base.BaseEntity;
import lombok.Data;

/**
 * @author mjh
 */
@Data
public class User extends BaseEntity {

    private String username;
    private String password;
    private String phoneNumber;
    private String email;

}
