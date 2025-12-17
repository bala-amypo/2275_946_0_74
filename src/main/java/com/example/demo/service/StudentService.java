package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.Student;

public interface StudentService {

    // create / insert data
    Student createData(Student stu);

    // fetch all records
    List<Student> fetchRecord();

    // fetch data by id
    Optional<Student>fetchDataById(int id);

}