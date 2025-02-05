package com.vinidev.desafio.service;

import com.vinidev.desafio.controller.dto.ScheduleNotificationDTO;
import com.vinidev.desafio.entity.Notification;
import com.vinidev.desafio.repositories.NotificationRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class NotificationService {

    private final NotificationRepository notificationRepository;

    public NotificationService(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    public void scheduleNotification(ScheduleNotificationDTO dto) {
        notificationRepository.save(dto.toNotification());
    }

    public Optional<Notification> getNotifications(Long id) {
        return notificationRepository.findById(id);
    }
}
