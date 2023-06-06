package com.by.study.dao;


import com.by.study.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 *
 */
public interface StudentDao {

    int insertStudent(Student student);

    List<Student> selectStudent();
}
