package com.vinidev.desafio.repositories;

import com.vinidev.desafio.entity.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
