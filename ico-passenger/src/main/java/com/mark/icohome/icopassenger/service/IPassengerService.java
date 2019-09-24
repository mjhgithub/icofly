package com.mark.icohome.icopassenger.service;

import com.mark.icohome.icopassenger.entity.Passenger;

/**
 * @author mjh
 */
public interface IPassengerService {
    Passenger get(String id);
    Passenger add(Passenger passenger);
    Passenger update(Passenger passenger);
    void delete(String id);
}
