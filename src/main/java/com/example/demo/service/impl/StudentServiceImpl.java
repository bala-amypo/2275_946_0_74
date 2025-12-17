// import java.util.List;  
// import org. springframework. beans. factory. annotation. Autowired;  
// import com.example.demo.entity.Student; 
// import com. example. demo.repository. StudentRepository; 
// import com.example.demo.service.StudentService;  
// import org.springframework.stereotype.Service;  

// @Service
//  public class StudentServiceImpl implements StudentService {  

//     @Autowired 
//     StudentRepository repo; 

//     @Override 
//     //create (or) Insert data 
//     public Student createData(Student stu) { 
//         return repo.save(stu);
//     }  
    
//     @Override 
//     // Fetch all records 
//     public List<Student> fetchRecord() { 
//         return repo.findAll();
//     } 
// } 







package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@Service 
public class StudentServiceImpl implements StudentService {


    @Autowired
    StudentRepository repo;

    //create (or) Insert data
    public Student createData(Student stu){
        return repo.save(stu);
    }

    //Fetch all records
    public List<Student>fetchRecord(){
        return repo.findAll();
    }

    public Optional<Student>fetchDataById(int id){
        return repo.findById(id);
    }

}









// package com.example.demo.service.implementation;

// import java.util.List;
// import java.util.Optional;
// import org.springframework.beans.factory.annotation.Autowired;
// import com.example.demo.entity.Student;
// import com.example.demo.repository.StudentRepository;

// public class StudentServiceImplementation {

//     @Autowired
//     StudentRepository repo;

//     //create (or) Insert data
//     public Student createData(Student stu){
//         return repo.save(stu);
//     }

//     //Fetch all records
//     public List<Student>fetchRecord(){
//         return repo.findAll();
//     }

//     public Optional<Student>fetchDataById(int id){
//         return repo.findById(id);
//     }

// }