package com.example.demo.config;

import org.quartz.SchedulerException;
import org.quartz.spi.InstanceIdGenerator;

import java.util.UUID;

public class QuartzInstanceIdGenerator implements InstanceIdGenerator {
    @Override
    public String generateInstanceId() throws SchedulerException {
        return "Quartz-Scheduler-" + UUID.randomUUID().toString().replaceAll("-", "");
    }
}
