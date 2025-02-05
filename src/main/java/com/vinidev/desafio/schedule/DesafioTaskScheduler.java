package com.vinidev.desafio.schedule;

import com.vinidev.desafio.service.NotificationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

@Component
public class DesafioTaskScheduler {

    private static final Logger logger = LoggerFactory.getLogger(DesafioTaskScheduler.class);

    private final NotificationService notificationService;

    public DesafioTaskScheduler(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @Scheduled(fixedDelay = 1, timeUnit = TimeUnit.MINUTES)
    public void checkTask() {
        var dateTime = LocalDateTime.now();
        logger.info("Running at {},", dateTime);

        notificationService.checkAndSend(dateTime);
    }
}
