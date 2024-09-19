package com.exampl.StudentManagement.studentManag.repository;

import com.exampl.StudentManagement.studentManag.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
