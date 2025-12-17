package com.example.demo.reponsitory;

import org.springframework.data.jpa.responsitory.JpaRepository;

import com.example.demo.entity.Student;

@Reponsitory
public interface StudentReponsitory extends JpaRepository<Student,long>{

}