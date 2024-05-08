package project2.Service;

import org.springframework.stereotype.Service;

import project2.Models.Cliente;

@Service
public interface ClienteService {

	Iterable<Cliente> buscarTodos();

	Cliente buscarPorId (Long id);
	void inserir(Cliente cliente);
	void atualizar(long id, Cliente cliente);
	void deletar(long id);
}
