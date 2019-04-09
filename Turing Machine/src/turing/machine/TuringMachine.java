package turing.machine;

public class TuringMachine {

    private static int cabecote;
    private static String[] fita = new String[10];

    public static int getCabecote() {
        return cabecote;
    }

    public static void setCabecote(int cabecote) {
        TuringMachine.cabecote = cabecote;
    }

    public static String[] getFita() {
        return fita;
    }

    public static void setFita(String[] fita) {
        TuringMachine.fita = fita;
    }

    public static void Inicializar() {
        setCabecote(0);
        fita[0] = ("*");

        for (int i = 1; i < 10; i++) {
            fita[i] = ("A");
        }
        fita[9] = ("branco");
    }

    public void Ler() {

    }

    public void Alterar() {

    }

    public void Mover() {

    }

    public void Quando() {

    }

    public static void main(String[] args) {
        Inicializar();

        for (int count = 0; count < 10; count++) {
            System.out.println(fita[count]);
        }
    }

}
