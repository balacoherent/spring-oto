package springboototo.springoneToOne.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springboototo.springoneToOne.Entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
