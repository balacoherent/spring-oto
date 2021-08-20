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
    @Column(name="student_id")
    private Long studentId;

    @Column(name = "student_Name")
    private String studentName;

    @Column(name = "student_Age")
    private Integer studentAge;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_addId")
    private Address address;
}
