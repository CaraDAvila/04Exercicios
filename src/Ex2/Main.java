package Ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int numeroSenha;
        String nomePaciente;

        System.out.println(">lista:");
        SenhaAtendimento s1 = new SenhaAtendimento("John");
        SenhaAtendimento s2 = new SenhaAtendimento("Jane");
        SenhaAtendimento s3 = new SenhaAtendimento("Joe");
        System.out.println(s1.getDados());
        System.out.println(s2.getDados());
        System.out.println(s3.getDados());

        System.out.println("");
        System.out.println(">proxima senha: " + SenhaAtendimento.contador);
    }
}
