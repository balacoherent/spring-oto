package springboototo.springoneToOne.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springboototo.springoneToOne.Baseresponse.BaseResponse;
import springboototo.springoneToOne.Dto.StudentDto;
import springboototo.springoneToOne.Entity.Student;
import springboototo.springoneToOne.Service.StudentService;

import java.util.List;

@RequestMapping("/student-detail")
@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/addStudent")
    public BaseResponse addStu(@RequestBody StudentDto studentDto) {
        return studentService.addStu(studentDto);
    }

    @GetMapping("/getAll")
    public List<Student> list() {
        return studentService.listAll();
    }

    @DeleteMapping("/deleteAll")
    public BaseResponse deletedetail() {
        return studentService.deleted();
    }

    @PutMapping("/update")
    public BaseResponse updatedetail(@RequestBody StudentDto studentDto) {
        return studentService.updatedetail(studentDto);
    }

}