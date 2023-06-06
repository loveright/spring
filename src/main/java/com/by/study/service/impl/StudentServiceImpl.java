package com.by.study.service.impl;

import com.by.study.dao.StudentDao;
import com.by.study.entity.Student;
import com.by.study.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    private StudentDao studentDao;

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public int addStudent(Student student) {
        int rows=studentDao.insertStudent(student);
        return rows;
    }

    @Override
    public List<Student> queryStudent() {
        List<Student> students=studentDao.selectStudent();
        return students;
    }
}
