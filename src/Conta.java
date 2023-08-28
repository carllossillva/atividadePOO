public class Conta {
    private int ID_Conta;
    private int ID_Cliente;
    private int ID_Agencia;
    // outros atributos

    public Conta(int ID_Conta, int ID_Cliente, int ID_Agencia) {
        this.ID_Conta = ID_Conta;
        this.ID_Cliente = ID_Cliente;
        this.ID_Agencia = ID_Agencia;
        // inicialize outros atributos se necessário
    }

    public void exibirDados() {
        System.out.println("Conta: ID = " + ID_Conta + ", ID Cliente = " + ID_Cliente + ", ID Agência = " + ID_Agencia);
    }


}
