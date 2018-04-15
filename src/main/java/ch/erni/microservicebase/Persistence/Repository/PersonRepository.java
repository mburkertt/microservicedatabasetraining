package ch.erni.microservicebase.Persistence.Repository;

import ch.erni.microservicebase.Persistence.DAO.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Matthias on 13/09/2017.
 */
@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
