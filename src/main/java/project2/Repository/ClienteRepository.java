package project2.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import project2.Models.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}
