package com.vinidev.desafio.controller;

import com.vinidev.desafio.controller.dto.ScheduleNotificationDTO;
import com.vinidev.desafio.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/notifications")
public class NotificationController {
    private NotificationService notificationService;

    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @PostMapping
    public ResponseEntity<Void> scheduleNotifications(@RequestBody ScheduleNotificationDTO dto) {
        notificationService.scheduleNotification(dto);

        return ResponseEntity.accepted().build();
    }
}
