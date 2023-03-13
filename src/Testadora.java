public class Testadora {
    public static void main(String[] args) {

        ContaLogin cl1 = new ContaLogin();
        ContaLogin cl2 = new ContaLogin();

        cl1.setSenha("xpto", 10);

        System.out.println("Senha cl1: " + cl1.getSenha());

        cl1.setNome("Alfredo");
        cl1.setEmail("alfredogog@gmail.com");

        cl2.setNome("Ana");
        cl2.setEmail("anaog@gmail.com");

        System.out.println("O nome de cl1 " + cl1.getNome());
        System.out.println("O nome de cl2 " + cl2.getNome());
    }
}
