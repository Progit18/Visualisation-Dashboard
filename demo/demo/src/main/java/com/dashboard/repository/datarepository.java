package com.dashboard.repository;

import com.dashboard.model.data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface datarepository extends JpaRepository<data, Long> {
}
