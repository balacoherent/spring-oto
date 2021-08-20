package springboototo.springoneToOne.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springboototo.springoneToOne.Baseresponse.BaseResponse;
import springboototo.springoneToOne.Dto.StudentDto;
import springboototo.springoneToOne.Entity.Address;
import springboototo.springoneToOne.Entity.Student;
import springboototo.springoneToOne.Repository.AddressRepository;
import springboototo.springoneToOne.Repository.StudentRepository;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private AddressRepository addressRepository;


    public BaseResponse addStu(StudentDto studentDto)
    {
        Student student=new Student();
        Address address=new Address();
        BaseResponse baseResponse = new BaseResponse();
        address.setCity(studentDto.getCity());
        address.setAddressType(studentDto.getAddressType());
        address = addressRepository.save(address);
        student.setStudentId(studentDto.getStudentId());
        student.setStudentName(studentDto.getStudentName());
        student.setStudentAge(studentDto.getStudentAge());
        student.setAddress(address);
        student = studentRepository.save(student);
        baseResponse.setStatusCode("200");
        baseResponse.setStatusMsg("success");
        baseResponse.setData(student);
        baseResponse.setData(address);
        baseResponse.setData(studentDto);
        return baseResponse;
    }

    public List<Student> listAll() {
        return studentRepository.findAll();
    }
    public BaseResponse deleted(){
        BaseResponse baseResponse = new BaseResponse();
        studentRepository.deleteAll();
        baseResponse.setStatusCode("200");
        baseResponse.setStatusMsg("students detail deleted successfully..");
        return baseResponse;
    }


    public BaseResponse updatedetail(StudentDto studentDto) {
        Student existstudent = studentRepository.findById(studentDto.getStudentId()).orElse(null);

        Address address=new Address();
        BaseResponse baseResponse=new BaseResponse();
        address.setCity(studentDto.getCity());
        address.setAddressId(studentDto.getAddressId());
        address=addressRepository.save(address);
        existstudent.setStudentName(studentDto.getStudentName());
        existstudent.setStudentId(studentDto.getStudentId());
        existstudent.setAddress(address);
        existstudent=studentRepository.save(existstudent);
        baseResponse.setStatusCode("200");
        baseResponse.setStatusMsg("success");
        baseResponse.setData(existstudent);
        baseResponse.setData(address);
        baseResponse.setData(studentDto);
        return  baseResponse;
    }
}
