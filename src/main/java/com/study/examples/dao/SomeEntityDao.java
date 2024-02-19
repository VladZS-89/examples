package com.study.examples.dao;

import com.study.examples.dao.entity.SomeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SomeEntityDao extends JpaRepository<SomeEntity, Long> {
}
