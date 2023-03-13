public class ContaLogin {
    private String nome;
    private String email;
    private String senha;

    public String getSenha(){
        return senha;
    }

    public void setSenha(String senha, int usuario){
        if (usuario == 10){
            this.senha = senha;
        } else {
            System.out.println("Você não tem o acesso devido.");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
