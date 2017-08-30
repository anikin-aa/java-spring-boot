package hello.data.access;

import hello.data.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/***
 * jpa repo for working with objects (cars)
 * for now this will be in - memory db
 */
@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
}
