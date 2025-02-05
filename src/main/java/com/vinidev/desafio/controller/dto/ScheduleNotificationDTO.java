package com.vinidev.desafio.controller.dto;

import com.vinidev.desafio.entity.Channel;
import com.vinidev.desafio.entity.Notification;
import com.vinidev.desafio.entity.Status;

import java.time.LocalDateTime;

public record ScheduleNotificationDTO(
        LocalDateTime dateTime,
        String destination,
        String message,
        Channel.Values channel
) {

    public Notification toNotification() {
        return new Notification(
                dateTime,
                destination,
                message,
                channel.toChannel(),
                Status.Values.PENDING.toStatus()
        );
    }
}
