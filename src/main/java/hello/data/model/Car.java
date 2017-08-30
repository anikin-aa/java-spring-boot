package hello.data.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/***
 * simple pojo class
 */
@Entity
public class Car {

   @Id
   @Getter
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id;

   @NotEmpty
   @Getter
   @Setter
   private String vinNumber;

}
