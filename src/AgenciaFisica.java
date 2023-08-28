public class AgenciaFisica {
    private int ID_Agencia;
    private String nome;
    // outros atributos

    public AgenciaFisica(int ID_Agencia, String nome) {
        this.ID_Agencia = ID_Agencia;
        this.nome = nome;
        // inicialize outros atributos se necessário
    }

    public void exibirDados() {
        System.out.println("Agência: ID = " + ID_Agencia + ", Nome = " + nome);
    }




}