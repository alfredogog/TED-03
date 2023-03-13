import java.util.Stack;

public class ContaCorrente {

    private String titular;
    private int numConta;
    private double saldo;

    public ContaCorrente(String titular, int numConta){
        this.titular = titular;
        this.numConta = numConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double verificarSaldo(){
        return saldo;
    }

    public void depositar(double valor){
        this.saldo += valor;
        System.out.println("Seu novo saldo é: " + this.saldo);
    }

    public void sacar(double valor){
        if (this.saldo >= valor){
            this.saldo -= valor;
            System.out.println("Seu novo saldo (saque): " + this.saldo);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
}
