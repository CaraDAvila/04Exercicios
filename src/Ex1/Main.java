package Ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        String nome;
        double valor;
        int quantidade;
        double porcentagem;

        System.out.print("Digite o nome do produto: ");
        nome = inp.next();
        System.out.print("Digite o valor do produto: R$");
        valor = inp.nextDouble();
        System.out.print("Digite o quantidade do produto: ");
        quantidade = inp.nextInt();

        Produto pro = new Produto(nome, valor, quantidade);

        System.out.println("Porcentagem do aumento: ");
        porcentagem = inp.nextDouble();
        pro.aumentarValor(porcentagem);

    }
}