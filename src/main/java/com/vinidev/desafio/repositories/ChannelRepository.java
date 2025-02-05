package com.vinidev.desafio.repositories;

import com.vinidev.desafio.entity.Channel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChannelRepository extends JpaRepository<Channel, Long> {
}
