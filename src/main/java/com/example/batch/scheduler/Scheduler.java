package com.example.batch.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Date;

import static java.lang.Thread.sleep;

@Component
public class Scheduler {

    @Scheduled(fixedRate = 5000)
    public void getCurrentTime() {
        System.out.println("start" + new Date());
    }
}
