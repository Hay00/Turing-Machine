package code;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Vinicios
 */
public class AlfabetoTotal {

    private String inicio;
    private String vazio;

    private List<String> alfabetos;
    private List<String> auxiliares;

    public AlfabetoTotal(){
        this.alfabetos = new ArrayList();
        this.auxiliares = new ArrayList();
    }
    
    public AlfabetoTotal(String inicio, String vazio, List<String> alfabetos, List<String> auxiliares) {
        this.inicio = inicio;
        this.vazio = vazio;
        this.alfabetos = new ArrayList();
        this.auxiliares = new ArrayList();
    }


    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getVazio() {
        return vazio;
    }

    public void setVazio(String vazio) {
        this.vazio = vazio;
    }

    public List<String> getAlfabetos() {
        return alfabetos;
    }

    public void setAlfabetos(List<String> alfabetos) {
        this.alfabetos = alfabetos;
    }

    public List<String> getAuxiliares() {
        return auxiliares;
    }

    public void setAuxiliares(List<String> auxiliares) {
        this.auxiliares = auxiliares;
    }

}
