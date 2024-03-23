package cadastro.domain;

/**
 * @author guiol
 */
public class Produto implements Persistente{

    private Long String;

    private String codigo;

    public Long getString() {
        return String;
    }

    public void setString(Long string) {
        String = string;
    }

    public java.lang.String getCodigo() {
        return codigo;
    }

    public void setCodigo(java.lang.String codigo) {
        this.codigo = codigo;
    }
}
