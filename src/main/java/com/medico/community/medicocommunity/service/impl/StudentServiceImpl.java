package com.medico.community.medicocommunity.service.impl;

import com.medico.community.medicocommunity.model.entity.StudentEntity;
import com.medico.community.medicocommunity.repository.StudentRepo;
import com.medico.community.medicocommunity.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepo studentRepo;

    @Override
    public StudentEntity createStudent(StudentEntity student) {
        StudentEntity newStudent = new StudentEntity();
        newStudent.setName(student.getName());
        System.out.println("Student created");
        return studentRepo.save(student);
    }

    @Override
    public StudentEntity getStudentById(int id) {
        StudentEntity student = studentRepo.findById(id).orElse(null);
        System.out.println("Student fetched");
        return student;
    }

    @Override
    public StudentEntity getStudentByName(String name) {
        StudentEntity student = studentRepo.findByName(name);
        System.out.println("Student fetched");
        return student;
    }

    @Override
    public void deleteStudent(int id) {
        studentRepo.deleteById(id);
        System.out.println("Student deleted");
    }
}
