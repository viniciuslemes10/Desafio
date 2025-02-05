package com.vinidev.desafio.service;

import com.vinidev.desafio.controller.dto.ScheduleNotificationDTO;
import com.vinidev.desafio.repositories.NotificationRepository;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    private final NotificationRepository notificationRepository;

    public NotificationService(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    public void scheduleNotification(ScheduleNotificationDTO dto) {
        notificationRepository.save(dto.toNotification());
    }
}
