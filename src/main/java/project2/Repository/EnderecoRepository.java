package project2.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import project2.Models.Endereco;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String> {

}
