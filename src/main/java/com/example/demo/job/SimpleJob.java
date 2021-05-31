package com.example.demo.job;

import com.example.demo.service.ServiceX;
import lombok.extern.slf4j.Slf4j;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
public class SimpleJob implements Job {

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        try {
            serviceX.execute();
        } catch (InterruptedException e) {
            log.error("error", e);
        }
    }

    ServiceX serviceX;

    @Autowired
    public void setServiceX(ServiceX serviceX) {
        this.serviceX = serviceX;
    }
}
