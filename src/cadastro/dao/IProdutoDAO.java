package cadastro.dao;

import cadastro.domain.Cliente;
import cadastro.domain.Produto;

import java.util.Collection;

public interface IProdutoDAO {
    public Boolean cadastrar(Produto produto);

    public void excluir(Long codigo);

    public void alterar(Produto produto);

    public Produto consultar(Long cpf);

    public Collection<Produto> buscarTodos();
}

