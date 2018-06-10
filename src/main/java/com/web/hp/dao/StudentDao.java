package com.web.hp.dao;

import com.web.hp.entity.Student;

import java.util.List;

public interface StudentDao {
    Integer getTotal();
    void addStudent(Student student);
    void deleteStudent(int id);
    void updateStudent(Student student);
    Student getStudent(int id);
    List<Student> list(int start, int count);

}
