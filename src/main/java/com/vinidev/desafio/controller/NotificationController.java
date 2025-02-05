package com.vinidev.desafio.controller;

import com.vinidev.desafio.controller.dto.ScheduleNotificationDTO;
import com.vinidev.desafio.entity.Notification;
import com.vinidev.desafio.service.NotificationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/notifications")
public class NotificationController {
    private final NotificationService notificationService;

    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @PostMapping
    public ResponseEntity<Void> scheduleNotifications(@RequestBody ScheduleNotificationDTO dto) {
        notificationService.scheduleNotification(dto);

        return ResponseEntity.accepted().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Notification> getNotifications(@PathVariable("id") Long id) {
        var notification = notificationService.getNotifications(id);

        if(notification.isEmpty()) return ResponseEntity.notFound().build();

        return ResponseEntity.ok(notification.get());
    }
}
