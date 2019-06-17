package code;

import java.util.ArrayList;
import java.util.List;
import utilities.Formatting;
import utilities.GUIMessage;

public class TuringMachine {

    private static int cabecote;
    private static String estadoInicial = "";
    private static String estadoAtual = "";
    private static List<String> fita;
    private static AlfabetoTotal alfabeto;
    private static List<Estado> listaEstadosTotal;
    private static List<String> listaEstadosNome;
    private static List<Funcao> listaFuncoes;

    //private String[][] historico = new String[9][7];
    public TuringMachine() {
        alfabeto = new AlfabetoTotal();
        listaEstadosNome = new ArrayList();
        listaEstadosTotal = new ArrayList();
        listaFuncoes = new ArrayList();
        fita = new ArrayList();
        inicializarFita();
    }

    /*
     * Inicio gets e sets
     */
    public static int getCabecote() {
        return cabecote;
    }

    public static void setCabecote(int cabecote) {
        TuringMachine.cabecote = cabecote;
    }

    public static String getEstadoAtual() {
        return estadoAtual;
    }

    public static void setEstadoAtual(String estadoAtual) {
        TuringMachine.estadoAtual = estadoAtual;
    }

    public static String getEstadoInicial() {
        return estadoInicial;
    }

    public static void setEstadoInicial(String estadoInicial) {
        TuringMachine.estadoInicial = estadoInicial;
    }

    public static List<String> getFita() {
        return fita;
    }

    public static void setFita(List<String> fita) {
        TuringMachine.fita = fita;
    }

    public static AlfabetoTotal getAlfabeto() {
        return alfabeto;
    }

    public static void setAlfabeto(AlfabetoTotal alfabeto) {
        TuringMachine.alfabeto = alfabeto;
    }

    public static List<Estado> getListaEstadosTotal() {
        return listaEstadosTotal;
    }

    public static void setListaEstadosTotal(List<Estado> listaEstadosTotal) {
        TuringMachine.listaEstadosTotal = listaEstadosTotal;
    }

    public static List<String> getListaEstadosNome() {
        return listaEstadosNome;
    }

    public static void setListaEstadosNome(List<String> listaEstadosNome) {
        TuringMachine.listaEstadosNome = listaEstadosNome;
    }

    public static List<Funcao> getListaFuncoes() {
        return listaFuncoes;
    }

    public static void setListaFuncoes(List<Funcao> listaFuncoes) {
        TuringMachine.listaFuncoes = listaFuncoes;
    }

    /*
     * Final gets e sets
     */
    public void inicializarFita() {
        fita.add(alfabeto.getInicio());
    }

    public void limparFita() {
        fita.clear();
        fita.add(alfabeto.getInicio());
    }

    public void moverCabecote(String direcao) {
        if (direcao.equals("Direita")) {
            cabecote += 1;
        } else {
            cabecote -= 1;
        }
    }

    public String lerFita() {
        return fita.get(cabecote);
    }

    public void escreverFita(String escrita) {
        fita.set(cabecote, escrita);
    }

    public String funcao(String estadoAtual, String estadoProx, String leitura, String escrita, String movimento) {
        escreverFita(escrita);
        moverCabecote(movimento);
        return estadoProx;
    }

    public boolean executar(Funcao temp_funcao) {
        for (int count = 0; count < listaEstadosTotal.size(); count++) {
            Estado temp_estado = listaEstadosTotal.get(count);

            if (temp_estado.getEstado().equals(estadoAtual)) {
                if (temp_estado.isAceitacao()) {
                    GUIMessage.inf("O programa entrou em: Estado de Aceitação");
                    return true;
                }
            }
        }

        String temp_leitura = lerFita();

        if (temp_funcao.getEstadoAtual().equals(estadoAtual) && temp_funcao.getLeitura().equals(temp_leitura)) {

            System.out.println("\nFita antes de alterar");
            for (int count = 0; count < fita.size(); count++) {
                System.out.print(" " + fita.get(count));
            }
            System.out.println("\n");
            System.out.println("Estado atual: " + estadoAtual + " estado da funcao: " + temp_funcao.getEstadoAtual());
            System.out.println("Função lê: " + temp_funcao.getLeitura() + " Função escreve " + temp_funcao.getEscreve());

            estadoAtual = funcao(temp_funcao.getEstadoAtual(), temp_funcao.getEstadoProximo(), temp_funcao.getLeitura(), temp_funcao.getEscreve(), temp_funcao.getDirecao());

            System.out.println("Proximo estado: " + estadoAtual + "\n");
            System.out.println("\nFita depois de alterar");
            for (int count = 0; count < fita.size(); count++) {
                System.out.print(" " + fita.get(count));
            }
            System.out.println("\n");
        }
        return false;
    }

}
