package turing.machine;

import java.util.Scanner;

public class TuringMachine {

    private int cabecote;
    private String estado = "";
    private char[] fita = new char[15];
    private String[][] tabela = new String[6][7];
    private final String DIREITA = "direita";
    private final String ESQUERDA = "esquerda";
    private final char BRANCO = 'β';

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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    /*
     * Final gets e sets
     */
    public void Inicializar(char[] entrada) {
        if (entrada.length < 18) {
            for (int count = 0; count < entrada.length; count++) {
                fita[count + 1] = entrada[count];
            }
            setCabecote(0);
            setEstado("q0");
            fita[0] = ('*');

            for (int count = entrada.length + 1; count < fita.length; count++) {
                fita[count] = (BRANCO);
            }
        } else {
            throw new RuntimeException("Sua string contém mais de 18 caracteres!");
        }
    }

    public char Ler() {
        char temp[] = getFita();
        int pos_cabecote = getCabecote();
        return temp[pos_cabecote];
    }

    public void Gravar(char str) {
        char temp[] = getFita();
        int pos_cabecote = getCabecote();
        temp[pos_cabecote] = str;
        setFita(temp);
    }

    public void Mover(String direcao) {
        if (cabecote <= fita.length - 1) {
            if (direcao.equals(DIREITA)) {
                setCabecote(cabecote + 1);
            } else if (direcao.equals(ESQUERDA)) {
                setCabecote(cabecote - 1);
            } else {
                throw new RuntimeException("Direção incorreta!");
            }
        }
    }

    public String q0(char palavra) {
        if (palavra == '*') {
            Gravar('*');
            Mover(DIREITA);
            return "q0";
        } else if (palavra == 'B') {
            Gravar('B');
            Mover(DIREITA);
            return "q3";
        } else if (palavra == 'a') {
            Gravar('A');
            Mover(DIREITA);
            return "q1";
        } else if (palavra == BRANCO) {
            Gravar(BRANCO);
            Mover(DIREITA);
            return "q4";
        }
        return "qe";
    }

    public String q1(char palavra) {
        if (palavra == 'a') {
            Gravar('a');
            Mover(DIREITA);
            return "q1";
        } else if (palavra == 'B') {
            Gravar('B');
            Mover(DIREITA);
            return "q1";
        } else if (palavra == 'b') {
            Gravar('B');
            Mover(ESQUERDA);
            return "q2";
        }
        return "qe";
    }

    public String q2(char palavra) {
        if (palavra == 'a') {
            Gravar('a');
            Mover(ESQUERDA);
            return "q2";
        } else if (palavra == 'B') {
            Gravar('B');
            Mover(ESQUERDA);
            return "q2";
        } else if (palavra == 'A') {
            Gravar('A');
            Mover(DIREITA);
            return "q0";
        }
        return "qe";
    }

    public String q3(char palavra) {
        if (palavra == 'B') {
            Gravar('B');
            Mover(DIREITA);
            return "q3";
        } else if (palavra == BRANCO) {
            Gravar(BRANCO);
            Mover(ESQUERDA);
            return "q4";
        }
        return "qe";
    }

    public String q4(char palavra) {
        return "Estado de Aceitação!";
    }

    public String qe(char palavra) {
        return "Palavra Rejeitada!";
    }

    public void executarMaquina() {
        char maq_letra = Ler();
        if (getEstado().equals("q0")) {
            setEstado(q0(maq_letra));
        } else if (getEstado().equals("q1")) {
            setEstado(q1(maq_letra));
        } else if (getEstado().equals("q2")) {
            setEstado(q2(maq_letra));
        } else if (getEstado().equals("q3")) {
            setEstado(q3(maq_letra));
        } else if (getEstado().equals("q4")) {
            throw new RuntimeException("inf");
        } else if (getEstado().equals("qe")) {
            throw new RuntimeException("error");
        }
    }

}
