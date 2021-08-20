package springboototo.springoneToOne.Dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter

public class StudentDto {
    private Long studentId;

    private String studentName;

    private Integer studentAge;

    private String city;

    private Integer addressId;

    private String addressType;
}
