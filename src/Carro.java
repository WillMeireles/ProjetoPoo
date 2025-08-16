public class Carro {
    public String nome;
    public String marca;
    public String cor;
    public String modelo;
    public int ano;

// Metodo construtor
    public Carro(String nome, String marca, String cor, String modelo, int ano) {
        this.nome = nome;
        this.marca = marca;
        this.cor = cor;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Marca: " + marca);
        System.out.println("Cor: " + cor);
        System.out.println("Modelo: " + modelo);


    }

}