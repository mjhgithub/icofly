package com.mark.icohome.icocore.base;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author mjh
 */
@Data
public class BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id;
    private Date createTime;
    private Date updateTime;
}
