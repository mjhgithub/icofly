package com.mark.icohome.icopassenger.service.impl;

import com.google.common.base.Preconditions;
import com.mark.icohome.icocore.exception.NotExistException;
import com.mark.icohome.icocore.exception.UserNotExistException;
import com.mark.icohome.icopassenger.dao.IPassengerDao;
import com.mark.icohome.icopassenger.entity.Passenger;
import com.mark.icohome.icopassenger.service.IPassengerService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author mjh
 */
@Component
public class PassengerServiceImpl implements IPassengerService {

    @Autowired
    private IPassengerDao passengerDao;

    @Override
    public Passenger get(String id) {
        Preconditions.checkArgument(StringUtils.isNotBlank(id), "乘客id不能为空");
        Passenger passenger = passengerDao.get(id);
        if (null == passenger) {
            throw new NotExistException("该乘客信息不存在");
        }
        return passenger;
    }

    @Override
    public Passenger add(Passenger passenger) {
        passenger.setCreateTime(new Date());
        return passenger;
    }

    @Override
    public Passenger update(Passenger passenger) {
        Preconditions.checkArgument(StringUtils.isNotBlank(passenger.getId()), "乘客id不能为空");
        passenger = passengerDao.get(passenger.getId());
        if (null == passenger) {
            throw new UserNotExistException("该乘客信息不存在");
        }
        passenger.setUpdateTime(new Date());
        return passenger;
    }

    @Override
    public void delete(String id) {
        Preconditions.checkArgument(StringUtils.isNotBlank(id), "乘客id不能为空");
        Passenger passenger = passengerDao.get(id);
        if (null == passenger) {
            throw new UserNotExistException("该乘客信息不存在");
        }
        passengerDao.delete(id);
    }
}
