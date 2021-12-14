package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    public void addNewStudent(Student student){
        System.out.println(student);
    }

    public List<Student> getStudents(){
        return studentRepository.findAll();


    }
//        return List.of(
//                new Student(
////                        1L,
////                        "Ken",
////                        "ken.masters@yahoo.com",
////                        LocalDate.of(2000, Month.JULY,5),
////                        21
//
//                )
//        );

//    }

}
