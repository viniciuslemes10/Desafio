package com.vinidev.desafio.repositories;

import com.vinidev.desafio.entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusRepository extends JpaRepository<Status, Long> {
}
