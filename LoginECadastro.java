class LoginECadastro {

    String nome;
    String telefone;
    String email;
    String senha;
    
    LoginECadastro(String N, String T, String E, String S) {
        nome = N;
        telefone = T;
        email = E;
        senha = S;
        
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
       System. out.println("Nova: " + senha); 
    
    }   
 }