package com.example.demo.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Student;
import repository.Sturepository;

@Service
public interface Stuserve {

  Student createData(Studeny stu);
  List<Student>fetch();

}