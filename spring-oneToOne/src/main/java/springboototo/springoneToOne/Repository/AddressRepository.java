package springboototo.springoneToOne.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import springboototo.springoneToOne.Entity.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {
}