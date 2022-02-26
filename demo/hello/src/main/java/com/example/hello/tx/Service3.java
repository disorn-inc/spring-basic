package com.example.hello.tx;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class Service3 {

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void doSth() {

    }
}
