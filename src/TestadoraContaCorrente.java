import java.sql.SQLOutput;

public class TestadoraContaCorrente {
    public static void main(String[] args) {

        ContaCorrente cc1 = new ContaCorrente("Alfredo", 13);

        System.out.println("Meu saldo é: " + cc1.verificarSaldo());
        cc1.depositar(1350.99);
        cc1.sacar(0.99);
        System.out.println("Meu saldo é: " + cc1.verificarSaldo());
        cc1.sacar(1500);
    }
}
