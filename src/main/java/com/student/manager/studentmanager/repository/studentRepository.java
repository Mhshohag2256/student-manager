package com.student.manager.studentmanager.repository;

import com.student.manager.studentmanager.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface studentRepository extends JpaRepository<Student,Long> {

}
