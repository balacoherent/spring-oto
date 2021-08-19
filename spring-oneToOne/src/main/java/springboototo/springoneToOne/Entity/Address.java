package springboototo.springoneToOne.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.transaction.Transactional;

@Entity
@Transactional
@Data
@NoArgsConstructor
@Table(name="address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="add_id")
    private Long addressId;
    private String city;
    private String  addressType;
}
