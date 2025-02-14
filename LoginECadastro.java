class LoginECadastro {

    String nome;
    String telefone;
    String email;
    String senha;
    
    LoginECadastro() {
        nome = "upcod";
        telefone = "85 989698556";
        email = "upcod3@gmail.com";
        senha = "";

    }
    void cadastro(){
        System.out.println("Faça Seu cadastro ");
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + telefone);
        System.out.println("Email: " + email);
        System.out.println("Senha: " + senha);
    }

    void recuperarSenha() {
        System.out.println("Recuperação de senha:");
        System.out.println("Nome " + nome);
        System.out.println("Telefone: " + telefone);
        System. out.println("Nova Senha: " + senha);
    }
}