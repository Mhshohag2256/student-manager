package com.student.manager.studentmanager.service.impl;

import com.student.manager.studentmanager.entity.Student;
import com.student.manager.studentmanager.repository.studentRepository;
import com.student.manager.studentmanager.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private studentRepository studentRepo;

    public StudentServiceImpl(studentRepository studentRepo) {
        super();
        this.studentRepo = studentRepo;
    }

    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepo.findById(id).get();
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepo.save(student);
    }
}
