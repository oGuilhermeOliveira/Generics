package cadastro.dao.generic;

import cadastro.domain.Persistente;
import cadastro.domain.Produto;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author guiol
 */
public abstract class GenericDAO<T extends Persistente> implements IGenericDAO<T> {

    private Map<Class, Map<Long, T>> map;

    public abstract Class<T> getTipoClase();

    public GenericDAO() {
        this.map = new HashMap<>();
    }

    @Override
    public Boolean cadastrar(T entity) {
        Map<Long, T> mapaInterno = this.map.get(getTipoClase());
            if (mapaInterno.containsKey(entity.getCodigo())) {
                return false;
            }
            mapaInterno.put(entity.getCodigo(), entity);
        return true;
    }

    @Override
    public void excluir(Long valor) {

    }

    @Override
    public void alterar(T entity) {

    }

    @Override
    public T consultar(Long valor) {
        return null;
    }

    @Override
    public Collection<T> buscarTodos() {
        return null;
    }
}
