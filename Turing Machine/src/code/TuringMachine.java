package code;

import utilities.Formatting;

public class TuringMachine {

    private final String DIREITA = "D";
    private final String ESQUERDA = "E";
    private int cabecote;
    private String estadoAtual = "";
    private char[] fita = new char[15];
    //

    private AlfabetoTotal alfabeto;

    private String[][] historico = new String[9][7];

    /*
     * Inicio gets e sets
     */
    public int getCabecote() {
        return cabecote;
    }

    public void setCabecote(int cabecote) {
        this.cabecote = cabecote;
    }

    public char[] getFita() {
        return fita;
    }

    public void setFita(char[] fita) {
        this.fita = fita;
    }

    public String[][] getHistorico() {
        return historico;
    }

    public void setHistorico(String[][] historico) {
        this.historico = historico;
    }

    /*
     * Final gets e sets
     */
    public boolean funcao(String estadoAtual, String estadoProx, String leitura, String escrita, String movimento) {
        
        return true;
    }

}
