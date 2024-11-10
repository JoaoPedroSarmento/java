package modelo;
public class Tesoureiro extends Funcionario implements Autenticavel{
    private int senha;
    public Tesoureiro(String nome, double salario) {
        super(nome, salario);
    }
    public Tesoureiro(String nome , double salario, int senha){
     this(nome, salario);
     this.setSenha(senha);
    }
   public void setSenha(int senha){
    this.senha = senha;
   }
    @Override
    public double getBonificacao() {
        return getSalario() * 0.08;
    }
    @Override
  public boolean autentica(int senha){
      return (this.senha == senha);
    }
}
