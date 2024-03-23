package cadastro.dao;

import cadastro.domain.Produto;

import java.util.Collection;

/**
 * @author guiol
 */
public class ProdutoDAO implements IProdutoDAO{


    @Override
    public Boolean cadastrar(Produto produto) {
        return null;
    }

    @Override
    public void excluir(Long codigo) {

    }

    @Override
    public void alterar(Produto produto) {

    }

    @Override
    public Produto consultar(Long cpf) {
        return null;
    }

    @Override
    public Collection<Produto> buscarTodos() {
        return null;
    }
}
