package turing.machine;

import java.util.Scanner;

public class TuringMachine {

    private int cabecote;
    private String estado = "";
    private char[] fita = new char[6];

    /*
     Inicio gets e sets
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
     Final gets e sets
     */
    public void Inicializar(char[] entrada) {
        if (entrada.length < 10) {
            for (int count = 0; count < entrada.length; count++) {
                fita[count + 1] = entrada[count];
            }
            setCabecote(0);
            setEstado("q0");
            fita[0] = ('*');
            fita[5] = ('V');
        } else {
            throw new RuntimeException("Sua string contém mais de 6 caracteres!");
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
        if (direcao.equals("direita")) {
            setCabecote(cabecote + 1);
        } else if (direcao.equals("esquerda")) {
            setCabecote(cabecote - 1);
        } else {
            throw new RuntimeException("Direção incorreta!");
        }
    }

    public String q0(char palavra) {
        if (palavra == '*') {
            Gravar('*');
            Mover("direita");
            return "q0";
        } else if (palavra == 'B') {
            Gravar('B');
            Mover("direita");
            return "q3";
        } else if (palavra == 'a') {
            Gravar('A');
            Mover("direita");
            return "q1";
        } else if (palavra == 'V') {
            Gravar('V');
            Mover("direita");
            return "q4";
        } else {
            throw new RuntimeException("Palavra incorreta!");
        }
    }

    public String q1(char palavra) {
        if (palavra == 'a') {
            Gravar('a');
            Mover("direita");
            return "q1";
        } else if (palavra == 'B') {
            Gravar('B');
            Mover("direita");
            return "q1";
        } else if (palavra == 'b') {
            Gravar('B');
            Mover("esquerda");
            return "q2";
        } else {
            throw new RuntimeException("Palavra incorreta!");
        }
    }

    public String q2(char palavra) {
        if (palavra == 'a') {
            Gravar('a');
            Mover("esquerda");
            return "q2";
        } else if (palavra == 'B') {
            Gravar('B');
            Mover("esquerda");
            return "q2";
        } else if (palavra == 'A') {
            Gravar('A');
            Mover("direita");
            return "q0";
        } else {
            throw new RuntimeException("Palavra incorreta!");
        }
    }

    public String q3(char palavra) {
        if (palavra == 'B') {
            Gravar('B');
            Mover("direita");
            return "q3";
        } else if (palavra == 'V') {
            Gravar('V');
            Mover("esquerda");
            return "q4";
        } else {
            throw new RuntimeException("Palavra incorreta!");
        }
    }

    public String q4(char palavra) {
        return "Estado de Aceitação!";
    }

    public static void main(String[] args) {
        TuringMachine maquina = new TuringMachine();
        Scanner teclado = new Scanner(System.in);
        try {
            System.out.println("Insira um valor");
            maquina.Inicializar(teclado.next().toCharArray());
            String maq_estado = maquina.getEstado();
            while (true) {
                char[] a = maquina.getFita();

                char maq_letra = maquina.Ler();
                System.out.println("Cabeçote: " + maquina.getCabecote());
                System.out.println("Estado atual: " + maq_estado);
                for (int count = 0; count < a.length; count++) {
                    System.out.println("Array: " + a[count]);
                }
                if (maq_estado.equals("q0")) {
                    maq_estado = maquina.q0(maq_letra);
                } else if (maq_estado.equals("q1")) {
                    maq_estado = maquina.q1(maq_letra);
                } else if (maq_estado.equals("q2")) {
                    maq_estado = maquina.q2(maq_letra);
                } else if (maq_estado.equals("q3")) {
                    maq_estado = maquina.q3(maq_letra);
                } else if (maq_estado.equals("q4")) {
                    System.out.println(maquina.q4(maq_letra));
                    break;
                }
            }
        } catch (RuntimeException e) {
            System.out.println(e);
        }
    }
}
