package com.springbootmultithreading.executor.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

@Configuration
@EnableAsync // its tells  spring framework to do the work in background

public class AsyncConfig {
    /* for the thread pull works
        we need to make a bean of executors
        we can give name or not its up to us

        if we dont configure the Executor, it wont create the ThreadPoolTaskExecutor,
        java will create a simple async task executor by default
        for this better to configure this bean, Executor
     */
    @Bean(name = "taskExecutor")
    public Executor taskExecutor() {
        // now we will add the thread related functionalities
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(2); // we are setting 2 thread in here
        executor.setMaxPoolSize(2); // max thread size
        executor.setQueueCapacity(100); // max this number of queue will be wait
        // pre-fix of the thread name
        executor.setThreadNamePrefix("User thread continuing -  ");
        // finally initialize it
        executor.initialize();
        return executor;
    }
}
