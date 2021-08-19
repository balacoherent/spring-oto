package springboototo.springoneToOne.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.transaction.Transactional;

@Entity
@Transactional
@Data
@NoArgsConstructor
@Table(name="student_details")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="stu_id")
    private Long studentId;
    private String studentName;
    private Integer studentAge;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_addId")
    private Address address;
}
