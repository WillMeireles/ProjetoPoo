// public class NOME {}
public class Produto {
   // 1. Atributo
   // public TIPO NOME;
   // tamanho, preco, cor, nome, unidade, marca
   public String nome;
   public double tamanho;
   public double preco;
   public String cor;
   public int unidade;
   public String marca;


   // 2. Metodo
   // Mostra informacoes do produto
   public void mostrarInformacoes() {
       System.out.println("Nome: " + nome);
       System.out.println("Preco: " + preco);
       System.out.println("Marca: " + marca);

   }

}
