//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

// TIPO NOME = new TIPO ()
   Produto prod1 = new Produto();
   prod1.nome = "Monitor";
   prod1.preco = 850.00;
   prod1.marca = "Dell";

   prod1.mostrarInformacoes();

        Produto prod2 = new Produto();

        prod2.nome = "Notebook";
        prod2.preco = 3000.00;
        prod2.marca = "Dell";

        prod2.mostrarInformacoes();


        Carro carro1 = new Carro("C3 Live Pack", "Citroen", "Preto", "Hatch", 2025);

        carro1.mostrarInformacoes();


        Carro carro2 = new Carro("Gol", "Volkswagen","Prata", "Hatch", 2024);
        carro2.nome = "nome";
        carro2.mostrarInformacoes();

        Musica minhaMusica = new Musica("Excluse", "Chris Brown", 60);


        System.out.println("Tocando agora: " + minhaMusica.titulo);
        System.out.println("Artista: " + minhaMusica.artista);
        System.out.println("Segundos: " + minhaMusica.segundos);


        // Instanciando objeto
        ContaBancaria conta = new ContaBancaria("William", 2000.00 );
        conta.sacar(500);

        System.out.println("saldo: " + conta.getSaldo());






    }
}