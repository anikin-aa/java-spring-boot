package hello.data.model;

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
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id;
   @NotEmpty
   private String vinNumber;

   public String getData() {
      return vinNumber;
   }

   public void setData(String data) {
      this.vinNumber = data;
   }
}
