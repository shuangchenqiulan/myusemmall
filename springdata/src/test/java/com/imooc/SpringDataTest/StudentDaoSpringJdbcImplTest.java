package com.imooc.SpringDataTest;

import com.imooc.dao.StudentDao;
import com.imooc.dao.StudentDaoSpringJdbcImpl;
import com.imooc.domain.Student;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.util.Assert;

import javax.sql.DataSource;
import java.util.List;

public class StudentDaoSpringJdbcImplTest {

    private ApplicationContext context = null;
    private StudentDao studentDao = null;

    @Before
    public void setup(){
        context = new ClassPathXmlApplicationContext("beans.xml");
        studentDao = (StudentDao) context.getBean("studentDAO");
        System.out.println("setup");
    }

    @After
    public void tearDown(){
        context = null;
        System.out.println("tearDown");
    }

    @Test
    public void testQuery() {
        /*StudentDaoSpringJdbcImpl studentDaoSpringJdbc = new StudentDaoSpringJdbcImpl();*/
        List<Student> studentList = studentDao.query();
        for(Student student : studentList) {
            System.out.println("id:"+student.getId()+",name:"+student.getName()+",age:"+student.getAge());
        }
    }

}
