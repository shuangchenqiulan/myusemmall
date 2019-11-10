package com.imooc.dao;

import com.imooc.domain.Student;

import java.util.List;

public interface StudentDao {
    List<Student> query();
    public void save(Student student);
}
