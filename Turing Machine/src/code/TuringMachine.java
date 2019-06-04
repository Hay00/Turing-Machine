package code;

import utilities.Formatting;

public class TuringMachine {

    private int cabecote;
    private String estado = "";
    private char[] fita = new char[15];
    private String[][] historico = new String[9][7];
    private final String DIREITA = "D";
    private final String ESQUERDA = "E";
    private final char BRANCO = 'β';
    private final char ACEITO = '1';

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

    public String[][] getHistorico() {
        return historico;
    }

    public void setHistorico(String[][] historico) {
        this.historico = historico;
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
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 7; j++) {
                    historico[i][j] = "";
                }
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
            switch (direcao) {
                case DIREITA:
                    setCabecote(cabecote + 1);
                    break;
                case ESQUERDA:
                    setCabecote(cabecote - 1);
                    break;
                default:
                    throw new RuntimeException("Direção incorreta!");
            }
        }
    }

    public void gravarAcao(String prox_estado, int estado_atual, char letra_lida, char gravar_caracter, String direcao) {
        Gravar(gravar_caracter);
        Mover(direcao);
        switch (letra_lida) {
            case '*':
                historico[estado_atual][0] = Formatting.concat_text(prox_estado, gravar_caracter, direcao);
                break;
            case 'a':
                historico[estado_atual][1] = Formatting.concat_text(prox_estado, gravar_caracter, direcao);
                break;
            case 'b':
                historico[estado_atual][2] = Formatting.concat_text(prox_estado, gravar_caracter, direcao);
                break;

            case 'A':
                historico[estado_atual][3] = Formatting.concat_text(prox_estado, gravar_caracter, direcao);
                break;
            case 'B':
                historico[estado_atual][4] = Formatting.concat_text(prox_estado, gravar_caracter, direcao);
                break;
            case BRANCO:
                historico[estado_atual][5] = Formatting.concat_text(prox_estado, gravar_caracter, direcao);
                break;
            case ACEITO:
                historico[estado_atual][6] = Formatting.concat_text(prox_estado, gravar_caracter, direcao);
                break;
            default:
                break;
        }
    }

    public String q8(char palavra) {
        switch (palavra) {
            case '*':
                gravarAcao("q0", 8, '*', '*', DIREITA);
                return "q0";

            // Loops
            case 'a':
                gravarAcao("q8", 8, 'a', 'a', ESQUERDA);
                return "q8";
            case 'b':
                gravarAcao("q8", 8, 'b', 'b', ESQUERDA);
                return "q8";
            case 'A':
                gravarAcao("q8", 8, 'A', 'A', ESQUERDA);
                return "q8";
            case 'B':
                gravarAcao("q8", 8, 'B', 'B', ESQUERDA);
                return "q8";
            case ACEITO:
                gravarAcao("q8", 8, ACEITO, ACEITO, ESQUERDA);
                return "q8";

            case BRANCO:
                gravarAcao("q8", 8, BRANCO, BRANCO, ESQUERDA);
                return "q8";
            default:
                return "qe";
        }
    }

    public String q0(char palavra) {
        switch (palavra) {
            case 'a':
                gravarAcao("q1", 0, 'a', 'A', DIREITA);
                return "q1";
            case 'b':
                gravarAcao("q4", 0, 'b', 'B', DIREITA);
                return "q4";
            case BRANCO:
                gravarAcao("q7", 0, BRANCO, BRANCO, ESQUERDA);
                return "q7";
            // Loops
            case '*':
                gravarAcao("q0", 0, '*', '*', DIREITA);
                return "q0";
            case ACEITO:
                gravarAcao("q0", 0, ACEITO, ACEITO, DIREITA);
                return "q0";
            case 'A':
                gravarAcao("q0", 0, 'A', 'A', DIREITA);
                return "q0";
            case 'B':
                gravarAcao("q0", 0, 'B', 'B', DIREITA);
                return "q0";
            default:
                return "qe";
        }
    }

    public String q1(char palavra) {
        switch (palavra) {
            case 'b':
                gravarAcao("q2", 1, 'b', 'B', DIREITA);
                return "q2";

            // Loops
            case 'a':
                gravarAcao("q1", 1, 'a', 'a', DIREITA);
                return "q1";
            case 'A':
                gravarAcao("q1", 1, 'A', 'A', DIREITA);
                return "q1";
            case 'B':
                gravarAcao("q1", 1, 'B', 'B', DIREITA);
                return "q1";
            case ACEITO:
                gravarAcao("q1", 1, ACEITO, ACEITO, DIREITA);
                return "q1";
            default:
                return "qe";
        }
    }

    public String q2(char palavra) {
        switch (palavra) {
            case 'A':
                gravarAcao("q3", 2, 'A', ACEITO, DIREITA);
                return "q3";

            // Loops
            case 'a':
                gravarAcao("q2", 2, 'a', 'a', ESQUERDA);
                return "q2";
            case 'b':
                gravarAcao("q2", 2, 'b', 'b', ESQUERDA);
                return "q2";
            case 'B':
                gravarAcao("q2", 2, 'B', 'B', ESQUERDA);
                return "q2";
            case ACEITO:
                gravarAcao("q2", 2, ACEITO, ACEITO, ESQUERDA);
                return "q2";
            case BRANCO:
                gravarAcao("q2", 2, BRANCO, BRANCO, ESQUERDA);
                return "q2";
            default:
                return "qe";
        }

    }

    public String q3(char palavra) {
        switch (palavra) {
            case 'B':
                gravarAcao("q8", 3, 'B', ACEITO, DIREITA);
                return "q8";

            // Loops
            case 'a':
                gravarAcao("q3", 3, 'a', 'a', DIREITA);
                return "q3";
            case 'b':
                gravarAcao("q3", 3, 'b', 'b', DIREITA);
                return "q3";
            case 'A':
                gravarAcao("q3", 3, 'A', 'A', DIREITA);
                return "q3";
            case ACEITO:
                gravarAcao("q3", 3, ACEITO, ACEITO, DIREITA);
                return "q3";
            default:
                return "qe";
        }

    }

    public String q4(char palavra) {
        switch (palavra) {
            case 'a':
                gravarAcao("q5", 4, 'a', 'A', DIREITA);
                return "q5";

            // Loops
            case 'b':
                gravarAcao("q4", 4, 'b', 'b', DIREITA);
                return "q4";
            case 'B':
                gravarAcao("q4", 4, 'B', 'B', DIREITA);
                return "q4";
            case 'A':
                gravarAcao("q4", 4, 'A', 'A', DIREITA);
                return "q4";
            case ACEITO:
                gravarAcao("q4", 4, ACEITO, ACEITO, DIREITA);
                return "q4";
            default:
                return "qe";
        }

    }

    public String q5(char palavra) {
        switch (palavra) {
            case 'B':
                gravarAcao("q6", 5, 'B', ACEITO, DIREITA);
                return "q6";

            // Loops
            case 'a':
                gravarAcao("q5", 5, 'a', 'a', ESQUERDA);
                return "q5";
            case 'b':
                gravarAcao("q5", 5, 'b', 'b', ESQUERDA);
                return "q5";
            case 'A':
                gravarAcao("q5", 5, 'A', 'A', ESQUERDA);
                return "q5";
            case ACEITO:
                gravarAcao("q5", 5, ACEITO, ACEITO, ESQUERDA);
                return "q5";

            case BRANCO:
                gravarAcao("q5", 5, BRANCO, BRANCO, ESQUERDA);
                return "q5";
            default:
                return "qe";
        }

    }

    public String q6(char palavra) {
        switch (palavra) {
            case 'A':
                gravarAcao("q8", 6, 'A', ACEITO, DIREITA);
                return "q8";

            //Loops
            case 'a':
                gravarAcao("q6", 6, 'a', 'a', DIREITA);
                return "q6";
            case 'b':
                gravarAcao("q6", 6, 'b', 'b', DIREITA);
                return "q6";
            case 'B':
                gravarAcao("q6", 6, 'B', 'B', DIREITA);
                return "q6";
            case ACEITO:
                gravarAcao("q6", 6, ACEITO, ACEITO, DIREITA);
                return "q6";
            default:
                return "qe";
        }

    }

    public String q7(char palavra) {
        switch (palavra) {
            default:
                return "q7";
        }

    }

    public String qe(char palavra) {
        return "Palavra Rejeitada!";
    }

    public void executarMaquina() {
        char maq_letra = Ler();
        switch (getEstado()) {
            case "q0":
                setEstado(q0(maq_letra));
                break;
            case "q1":
                setEstado(q1(maq_letra));
                break;
            case "q2":
                setEstado(q2(maq_letra));
                break;
            case "q3":
                setEstado(q3(maq_letra));
                break;
            case "q4":
                setEstado(q4(maq_letra));
                break;
            case "q5":
                setEstado(q5(maq_letra));
                break;
            case "q6":
                setEstado(q6(maq_letra));
                break;
            case "q8":
                setEstado(q8(maq_letra));
                break;
            case "q7":
                throw new RuntimeException("inf");
            case "qe":
                throw new RuntimeException("error");
            default:
                break;
        }
    }
}
