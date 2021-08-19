package springboototo.springoneToOne.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import springboototo.springoneToOne.Entity.Student;
import springboototo.springoneToOne.Repository.StudentRepository;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentRepository stu;

    @PostMapping("/students")
    public ResponseEntity<String> students(@RequestBody List<Student> Data){
        stu.saveAll(Data);
        return ResponseEntity.ok("Student data saved");
    }

    @GetMapping("/getAll")
    public List<Student> getAll(){
        return stu.findAll();
    }
}