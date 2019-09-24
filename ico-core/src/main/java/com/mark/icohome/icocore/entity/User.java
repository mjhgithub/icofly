package com.mark.icohome.icocore.entity;

import com.mark.icohome.icocore.base.BaseEntity;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * @author mjh
 */

@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
public class User extends BaseEntity {

    private String username;
    private String password;
    private String phoneNumber;
    private String email;

}
