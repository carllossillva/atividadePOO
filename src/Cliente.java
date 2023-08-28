public class Cliente {
    private int ID_Cliente;
    private String nome;
    // outros atributos

    public Cliente(int ID_Cliente, String nome) {
        this.ID_Cliente = ID_Cliente;
        this.nome = nome;
        // inicialize outros atributos se necessário
    }

    public void exibirDados() {
        System.out.println("Cliente: ID = " + ID_Cliente + ", Nome = " + nome);
    }


    // outros métodos gerais
}