public class ContaBancaria {
private String nome;
private double saldo;


// Metodo depositar
public void depositar (double valor){
    saldo += valor;
    // saldo = saldo + valor

}

//Metodo Sacar
public void sacar (double valor){
    saldo -= valor;
    // saldo = saldo - valor

}

// Metodo Constutor
    public ContaBancaria(String nome, double saldo) {
    this.nome = nome;
    this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }
}
