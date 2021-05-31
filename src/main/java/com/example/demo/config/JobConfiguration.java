package com.example.demo.config;

import com.example.demo.job.SimpleJob;
import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JobConfiguration {

    @Bean
    public JobDetail simpleJob() {
        return JobBuilder.newJob(SimpleJob.class).withIdentity("simpleJob")
                .storeDurably()
                .build();
    }

    @Bean
    public Trigger jobATrigger(JobDetail simpleJob) {
        return TriggerBuilder.newTrigger().forJob(simpleJob)
                .withIdentity("simpleJobTrigger")
                .withSchedule(CronScheduleBuilder.cronSchedule("0 0/1 * ? * * *"))
                .build();
    }
}
