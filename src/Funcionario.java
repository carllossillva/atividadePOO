public class Funcionario {
    private int ID_Funcionario;
    private String nome;
    // outros atributos

    public Funcionario(int ID_Funcionario, String nome) {
        this.ID_Funcionario = ID_Funcionario;
        this.nome = nome;
        // inicialize outros atributos se necessário
    }

    public void exibirDados() {
        System.out.println("Funcionário: ID = " + ID_Funcionario + ", Nome = " + nome);
    }




}
