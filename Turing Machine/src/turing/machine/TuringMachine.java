package turing.machine;

public class TuringMachine {

    private int cabecote;
    private String[] fita = new String[10];


    /*
     Inicio gets e sets
     */
    public int getCabecote() {
        return cabecote;
    }

    public void setCabecote(int cabecote) {
        this.cabecote = cabecote;
    }

    public String[] getFita() {
        return fita;
    }

    public void setFita(String[] fita) {
        this.fita = fita;
    }
    /*
     Final gets e sets
     */

    public void Inicializar() {
        setCabecote(0);
        fita[0] = ("*");

        for (int i = 1; i < 10; i++) {
            fita[i] = ("A");
        }
        fita[9] = ("branco");
    }

    public String Ler() {
        String temp[] = getFita();
        int pos_cab = getCabecote();
        return temp[pos_cab];
    }

    public void Alterar(String str) {
        String temp[] = getFita();
        int pos_cab = getCabecote();
        temp[pos_cab] = str;
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

    public static void main(String[] args) {
        // Objeto referente essa própria classe.
        TuringMachine maquina = new TuringMachine();

        // Inicializa a máquina.
        maquina.Inicializar();

        // Printa os valores do vetor.
        System.out.println("Vetor da máquina:");
        String[] fita_temp = maquina.getFita();
        for (int count = 0; count < 10; count++) {
            System.out.println(fita_temp[count]);
        }

        // Evitando desvios fora das condições impostas!
        try {
            System.out.println("\nLendo um valor: " + maquina.Ler());

            System.out.println("\nMovendo o cabeçote para a direita!");

            maquina.Mover("direita");
            System.out.println("\nLendo um valor: " + maquina.Ler());

            System.out.println("\nMovendo o cabeçote para a esquerda!");

            maquina.Mover("esquerda");

            System.out.println("\nLendo um valor: " + maquina.Ler());
        } catch (RuntimeException e) {
            System.out.println("\n\nOcorreu um erro! : " + e);
        }
    }

}
