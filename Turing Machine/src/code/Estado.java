package code;

/**
 *
 * @author Vinicios
 */
public class Estado {

    private String estado;
    private boolean aceitacao;

    public Estado(String estado, boolean isAceitacao) {
        this.estado = estado;
        this.aceitacao = isAceitacao;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public boolean isAceitacao() {
        return aceitacao;
    }

    public void setAceitacao(boolean aceitacao) {
        this.aceitacao = aceitacao;
    }
}
