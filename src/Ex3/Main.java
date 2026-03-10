package Ex3;

import java.util.Scanner;

public class Main {

    static Scanner inp = new Scanner(System.in);
    static BilheteUnico bilhete;

    static {
        System.out.print("Nome de usuario: ");
        String usuario = inp.nextLine();
        System.out.print("Tipo de tarifa (Normal/Professor/Aluno): ");
        String tipoTarifa = inp.next();

        bilhete = new BilheteUnico(usuario, tipoTarifa);
    }

    public static void main(String[] args) {

        double valorCarregar;
        int opcao;

        do {
            System.out.println("--------MENU--------");
            System.out.println("1- <Carregar bilhete>");
            System.out.println("2- <Consultar saldo>");
            System.out.println("3- <Passar catraca>");
            System.out.println("4- Finalizar");
            System.out.println("--------------------");
            opcao = inp.nextInt();

        } while (opcao != 4);

        switch (opcao) {
            case 1 -> carregarBilhete();
            case 2 -> consultarSaldo();
            case 3 -> passarCatraca();
            case 4 -> System.out.println("Serviço finalizado.");
            default -> System.out.println("[?] opcão invalida, tente novamente");
        }
    }

    private static void passarCatraca() {
        if (!bilhete.passagem()) {
            System.out.println("Saldo insuficiente.");
        }
        consultarSaldo();
    }

    private static void consultarSaldo() {
        System.out.println("----SALDO----");
        System.out.println("Saldo atual: R$" + bilhete.saldo);
        System.out.println("------------");

    }

    private static void carregarBilhete() {
        double valor;
        System.out.println("----CARREGAR----");
        System.out.print("[R$ " + bilhete.saldo + "] | Valor para carregar bilhete: ");
        valor = inp.nextDouble();
        bilhete.carregarBilhete(valor);
    }
}
