package code;

/**
 *
 * @author Vinicios
 */
public class Funcao {

    private String leitura;
    private String escreve;
    private String estadoAtual;
    private String estadoProximo;
    private String direcao;

    public Funcao(String leitura, String escreve, String estadoAtual, String estadoProximo, String direcao) {
        this.leitura = leitura;
        this.escreve = escreve;
        this.estadoAtual = estadoAtual;
        this.estadoProximo = estadoProximo;
        this.direcao = direcao;
    }

    public String getLeitura() {
        return leitura;
    }

    public void setLeitura(String leitura) {
        this.leitura = leitura;
    }

    public String getEscreve() {
        return escreve;
    }

    public void setEscreve(String escreve) {
        this.escreve = escreve;
    }

    public String getEstadoAtual() {
        return estadoAtual;
    }

    public void setEstadoAtual(String estadoAtual) {
        this.estadoAtual = estadoAtual;
    }

    public String getEstadoProximo() {
        return estadoProximo;
    }

    public void setEstadoProximo(String estadoProximo) {
        this.estadoProximo = estadoProximo;
    }

    public String getDirecao() {
        return direcao;
    }

    public void setDirecao(String direcao) {
        this.direcao = direcao;
    }

}
