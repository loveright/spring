package com.by;

import com.by.study.dao.StudentDao;
import com.by.study.entity.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void test01() {
        String config="applicationContext.xml";
        ApplicationContext ctx=new ClassPathXmlApplicationContext(config);

        StudentDao studentDao= (StudentDao) ctx.getBean("studentDao");

        Student student=new Student();
        student.setName("李四");
        student.setAge(20);
        studentDao.insertStudent(student);
    }
}
