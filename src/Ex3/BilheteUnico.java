package Ex3;

import java.util.Random;
import java.util.Scanner;

public class BilheteUnico {

    int numeroBilhete;
    String usuario;
    double saldo;
    String tipoTarifa;

    static final double TARIFABASE = 5.40;


    public BilheteUnico(String usuario, String tipoTarifa) {
        this.usuario = usuario;
        this.tipoTarifa = tipoTarifa;
        Scanner inp = new Scanner(System.in);
        Random random = new Random();
        this.numeroBilhete = random.nextInt(1000, 9999);
    }

    public void carregarBilhete(double valorCarregar) {
        this.saldo += valorCarregar;
    }

    public boolean passagem() {
        double valor = TARIFABASE;
        if (tipoTarifa.equalsIgnoreCase("estudante") || tipoTarifa.equalsIgnoreCase("professor")) {
            valor = valor / 2;
        }
        if (saldo < valor) {
            return false;
        }
        saldo -= valor;
        return true;
    }

}
