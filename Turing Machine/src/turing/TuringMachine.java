package turing;

public class TuringMachine {

    private int cabecote;
    private String estado = "";
    private char[] fita = new char[15];
    private String[][] historico = new String[5][6];
    private final String DIREITA = "D";
    private final String ESQUERDA = "E";
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
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 6; j++) {
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

    public void gravarAcao(String prox_estado, int estado_atual, char gravar_caracter, char letra_lida, String direcao) {
        Gravar(gravar_caracter);
        Mover(direcao);
        switch (letra_lida) {
            case '*':
                historico[estado_atual][0] = ("(" + prox_estado + "," + gravar_caracter + "," + direcao + ")");
                break;
            case 'a':
                historico[estado_atual][1] = ("(" + prox_estado + "," + gravar_caracter + "," + direcao + ")");
                break;
            case 'b':
                historico[estado_atual][2] = ("(" + prox_estado + "," + gravar_caracter + "," + direcao + ")");
                break;

            case 'A':
                historico[estado_atual][3] = ("(" + prox_estado + "," + gravar_caracter + "," + direcao + ")");
                break;
            case 'B':
                historico[estado_atual][4] = ("(" + prox_estado + "," + gravar_caracter + "," + direcao + ")");
                break;
            case BRANCO:
                historico[estado_atual][5] = ("(" + prox_estado + "," + gravar_caracter + "," + direcao + ")");
                break;
            default:
                break;
        }
    }

    public String q0(char palavra) {
        switch (palavra) {
            case '*':
                gravarAcao("q0", 0, '*', '*', DIREITA);
                return "q0";
            case 'B':
                gravarAcao("q3", 0, 'B', 'B', DIREITA);
                return "q3";
            case 'a':
                gravarAcao("q1", 0, 'A', 'a', DIREITA);
                return "q1";
            case BRANCO:
                gravarAcao("q4", 0, BRANCO, BRANCO, DIREITA);
                return "q4";
            default:
                return "qe";
        }
    }

    public String q1(char palavra) {
        switch (palavra) {
            case 'a':
                gravarAcao("q1", 1, 'a', 'a', DIREITA);
                return "q1";
            case 'B':
                gravarAcao("q1", 1, 'B', 'B', DIREITA);
                return "q1";
            case 'b':
                gravarAcao("q2", 1, 'B', 'b', ESQUERDA);
                return "q2";
            default:
                return "qe";
        }
    }

    public String q2(char palavra) {
        switch (palavra) {
            case 'a':
                gravarAcao("q2", 2, 'a', 'a', ESQUERDA);
                return "q2";
            case 'B':
                gravarAcao("q2", 2, 'B', 'B', ESQUERDA);
                return "q2";
            case 'A':
                gravarAcao("q0", 2, 'A', 'A', DIREITA);
                return "q0";
            default:
                return "qe";
        }
    }

    public String q3(char palavra) {
        switch (palavra) {
            case 'B':
                gravarAcao("q3", 3, 'B', 'B', DIREITA);
                return "q3";
            case BRANCO:
                gravarAcao("q4", 3, BRANCO, BRANCO, ESQUERDA);
                return "q4";
            default:
                return "qe";
        }
    }

    public String q4(char palavra) {
        return "Estado de Aceitação!";
    }

    public String qe(char palavra) {
        return "Palavra Rejeitada!";
    }

    public void executarMaquina() {
        char maq_letra = Ler();
        String a = getEstado();

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
                throw new RuntimeException("inf");
            case "qe":
                throw new RuntimeException("error");
            default:
                break;
        }
    }
}
