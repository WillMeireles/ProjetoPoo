public class Musica {
    public String titulo;
    public String artista;
    public int segundos;

    // Metodo Construtor
    public Musica(String titulo, String artista, int segundos) {
        this.titulo = titulo;
        this.artista = artista;
        this.segundos = segundos;
    }


    public void exibirInformacoes(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Segundos: " + segundos);
    }

}

