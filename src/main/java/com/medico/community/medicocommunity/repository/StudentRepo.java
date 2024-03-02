package com.medico.community.medicocommunity.repository;

import com.medico.community.medicocommunity.model.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<StudentEntity, Integer> {
    StudentEntity findByName(String name);
}
