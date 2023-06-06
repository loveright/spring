package com.by.study.service;

import com.by.study.entity.Student;

import java.util.List;

/**
 *
 */
public interface StudentService {

    int addStudent(Student student);

    List<Student> queryStudent();
}
