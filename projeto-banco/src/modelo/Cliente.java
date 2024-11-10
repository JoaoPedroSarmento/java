package modelo;
public class Cliente implements Autenticavel{
    private String nome;
    private String cpf;
    private String  email;
    private int senha;
  public Cliente(){
   
  }
   public Cliente(String nome){
      this.setNome(nome);
   }
  public Cliente(String nome,  String cpf){
   this(nome);
   this.setCpf(cpf);
  }
  public Cliente(String nome, String cpf, int senha){
     this(nome , cpf);
     this.setSenha(senha); 
 }
    public int getSenha(){
      return this.senha;
    }

    @Override
    public boolean autentica(int senha){
      return  (this.senha ==senha);
    }
    public String getNome(){
       return this.nome;
    }
    public String getCpf(){
       return this.cpf;
    }
    public String getEmail(){
       return this.email;
    }
    public void setCpf(String cpf){
       if(validaCpf(cpf)){
          this.cpf = cpf;
       }
   }
   public void setSenha(int senha){
      this.senha = senha;
   }
 
   public void setNome(String titular){
     if(titular.length() < 5) return;
     this.nome = titular;
   }
   public void setEmail(String email){
       if(validaEmail(email)){
          this.email = email;
       }
   }
   private boolean validaEmail(String email){
    if(email.length() <= 1) return false;
    if(email.indexOf("@") == -1) return false;
    return true;
 
   }
    private boolean validaCpf(String cpf){
       return cpf.length() == 11;
    }

 }
 