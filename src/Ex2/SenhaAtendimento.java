package Ex2;

public class SenhaAtendimento {
    int numeroSenha;
    String nomePaciente;

    static int contador = 100;


    public SenhaAtendimento(String nomePaciente) {
        this.nomePaciente = nomePaciente;
        this.numeroSenha = ++contador;
    }

    public String getDados() {
        return "Paciente[" + nomePaciente + "] Senha[#" + numeroSenha + "]";
    }
}
