package com.example.demo.service;

import java.util.List;
// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Student;
// import com.example.demo.repository.StudentRepository;

@Service
public interface StudentService {

    // @Autowired
    StudentRepository repo;

    //create (or) Insert data
     Student createData(Student stu);

    //Fetch all records
    List<Student>fetchRecord();

}