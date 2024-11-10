package modelo;
public class Gerente extends Funcionario implements Autenticavel {
    protected int senha;
    public Gerente(String nome , double salario){
       super(nome, salario);
    }
   public  Gerente(String nome, double  salario, int senha){
        this(nome, salario);
        this.setSenha(senha);
   }
  public int getSenha(){
    return this.senha;
  }
  
   public void setSenha(int senha){
    this.senha = senha;
   }
    @Override
    public double getBonificacao() {
        return getSalario() * 0.15; 
    }
    @Override
    public boolean autentica(int senha){
        return (this.senha == senha);
      }

}
