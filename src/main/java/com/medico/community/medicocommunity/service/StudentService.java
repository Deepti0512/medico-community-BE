package com.medico.community.medicocommunity.service;

import com.medico.community.medicocommunity.model.entity.StudentEntity;

public interface StudentService {
    StudentEntity createStudent( StudentEntity student);
    StudentEntity getStudentById(int id);
    StudentEntity getStudentByName(String name);
    void deleteStudent(int id);
}
