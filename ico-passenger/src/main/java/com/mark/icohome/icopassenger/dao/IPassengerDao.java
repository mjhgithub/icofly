package com.mark.icohome.icopassenger.dao;

import com.mark.icohome.icopassenger.entity.Passenger;

/**
 * @author mjh
 */
public interface IPassengerDao {
    Passenger get(String id);
    Passenger add(Passenger passenger);
    Passenger update(Passenger passenger);
    void delete(String id);
}
