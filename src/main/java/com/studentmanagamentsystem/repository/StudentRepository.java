package com.studentmanagamentsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studentmanagamentsystem.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
