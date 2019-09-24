package com.mark.icohome.icopassenger.controller;

import com.mark.icohome.icocore.base.BaseResult;
import com.mark.icohome.icocore.exception.ErrorCodeEnum;
import com.mark.icohome.icocore.exception.UserNotExistException;
import com.mark.icohome.icocore.utils.ResultUtils;
import com.mark.icohome.icopassenger.entity.Passenger;
import com.mark.icohome.icopassenger.service.IPassengerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author mjh
 */

@Slf4j
@RestController
@RequestMapping("/api/passenger")
public class IndexController {

    @Autowired
    private IPassengerService passengerService;

    @RequestMapping("/index")
    public BaseResult<Object> index() {
        return ResultUtils.success("passenger");
    }

    @GetMapping("/{id}")
    public BaseResult<Object> get(@PathVariable String id) {
        Passenger passenger = passengerService.get(id);
        return ResultUtils.success(passenger);
    }

    @PostMapping("/")
    public BaseResult<Object> add(@Valid @RequestBody Passenger passenger) {
        passengerService.add(passenger);
        return ResultUtils.success(passenger);
    }

    @PutMapping("/{id}")
    public BaseResult<Object> update(@PathVariable String id, @Valid @RequestBody Passenger passenger) {
        passenger.setId(id);
        passengerService.update(passenger);
        return ResultUtils.success(passenger);
    }

    @DeleteMapping("/{id}")
    public BaseResult<Object> delete(@PathVariable String id) {
        passengerService.delete(id);
        return ResultUtils.success(id);
    }

}
