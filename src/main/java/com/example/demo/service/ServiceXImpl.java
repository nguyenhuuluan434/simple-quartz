package com.example.demo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Slf4j
@Service
public class ServiceXImpl implements ServiceX {

    @Override
    public void execute() throws InterruptedException {
            Thread.sleep(20_000l);
        log.info("Service x execute");
    }
}
