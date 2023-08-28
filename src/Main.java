public class Main {
    public static void main(String[] args) {
        Banco banco1 = new Banco(1, "Bradesco", "Rua Principal, 123");
        Cliente cliente1 = new Cliente(1, "João");
        AgenciaFisica agencia1 = new AgenciaFisica(101, "Agência Casa amarela");
        Conta conta1 = new Conta(1001, 1231, 101);
        Funcionario funcionario1 = new Funcionario(10001, "Pedro");

        Banco banco2 = new Banco(3, "Itau", "Rua Direita, 127");
        Cliente cliente2 = new Cliente(1, "Carlos");
        AgenciaFisica agencia2 = new AgenciaFisica(101, "Agência Dantas barreto");
        Conta conta2 = new Conta(1453, 632, 176);
        Funcionario funcionario2 = new Funcionario(10886, "Gabriel");

        // Exibir dados iniciais
        banco1.exibirDados();
        cliente1.exibirDados();
        agencia1.exibirDados();
        conta1.exibirDados();
        funcionario1.exibirDados();

        banco2.exibirDados();
        cliente2.exibirDados();
        agencia2.exibirDados();
        conta2.exibirDados();
        funcionario2.exibirDados();




    }
}
