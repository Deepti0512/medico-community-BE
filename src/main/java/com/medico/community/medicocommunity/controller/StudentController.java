package com.medico.community.medicocommunity.controller;

import com.medico.community.medicocommunity.model.entity.StudentEntity;
import com.medico.community.medicocommunity.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("medico/api/student")
@CrossOrigin(origins = "*")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @PostMapping("/add")
    public StudentEntity createStudent( @RequestBody StudentEntity student) {
        return studentService.createStudent(student);
    }

    @GetMapping("/{studentId}")
    public StudentEntity getStudentById(@PathVariable("studentId") int id) {
        return studentService.getStudentById(id);
    }

    @DeleteMapping("/delete/{studentId}")
    public void deleteStudent(@PathVariable("studentId") int id) {
        studentService.deleteStudent(id);
    }
}
