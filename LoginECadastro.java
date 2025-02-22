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

    void recuperarSenha() {
       System.out.println("Recuperação de senha:");
       System. out.println("Nova: " + senha); 
    
    }   
 }