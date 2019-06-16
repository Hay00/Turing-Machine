package code;

import java.util.ArrayList;
import java.util.List;
import utilities.Formatting;

public class TuringMachine {

    private int cabecote;
    private String estadoAtual = "";
    private String[] fita = new String[15];
    private AlfabetoTotal alfabeto;
    private List<String> listaEstados;
    private List<Funcao> listaFuncoes;

    //private String[][] historico = new String[9][7];

    public TuringMachine() {
        alfabeto = new AlfabetoTotal();
        listaEstados = new ArrayList();
        listaFuncoes = new ArrayList();
    }

    /*
     * Inicio gets e sets
     */
    public int getCabecote() {
        return cabecote;
    }

    public void setCabecote(int cabecote) {
        this.cabecote = cabecote;
    }

    public String getEstadoAtual() {
        return estadoAtual;
    }

    public void setEstadoAtual(String estadoAtual) {
        this.estadoAtual = estadoAtual;
    }

    public String[] getFita() {
        return fita;
    }

    public void setFita(String[] fita) {
        this.fita = fita;
    }

    public AlfabetoTotal getAlfabeto() {
        return alfabeto;
    }

    public void setAlfabeto(AlfabetoTotal alfabeto) {
        this.alfabeto = alfabeto;
    }

    public List<String> getListaEstados() {
        return listaEstados;
    }

    public void setListaEstados(List<String> listaEstados) {
        this.listaEstados = listaEstados;
    }

    public List<Funcao> getListaFuncoes() {
        return listaFuncoes;
    }

    public void setListaFuncoes(List<Funcao> listaFuncoes) {
        this.listaFuncoes = listaFuncoes;
    }

//    public String[][] getHistorico() {
//        return historico;
//    }
//
//    public void setHistorico(String[][] historico) {
//        this.historico = historico;
//    }

    /*
     * Final gets e sets
     */
    public void moverCabecote(String direcao) {
        if (direcao.equals("Direita")) {
            cabecote +=1;
        } else {
            cabecote -=1;
        }
    }

    public boolean lerFita(String leitura){
        if(fita[cabecote].equals(leitura)){
            return true;
        }
        return false;
    }
    
    public void escreverFita(String escrita){
        fita[cabecote] = escrita;
    }
    public String funcao(String estadoAtual, String estadoProx, String leitura, String escrita, String movimento) {
        if(lerFita(leitura)){
            escreverFita(escrita);
        }
        moverCabecote(movimento);
        return estadoProx;
    }

}
