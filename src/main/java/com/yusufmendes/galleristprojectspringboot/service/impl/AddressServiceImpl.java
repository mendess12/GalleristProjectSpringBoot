package com.yusufmendes.galleristprojectspringboot.service.impl;

import com.yusufmendes.galleristprojectspringboot.exception.BaseException;
import com.yusufmendes.galleristprojectspringboot.exception.ErrorMessage;
import com.yusufmendes.galleristprojectspringboot.service.IAddressService;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements IAddressService {

    public void test() {
        throw new BaseException(new ErrorMessage(null, null));
    }
}
