package modelo;

public abstract class FuncionarioAuteticavel  extends Funcionario{
    protected int senha;
    public FuncionarioAuteticavel(String nome , double salario){
        super(nome, salario);
    }
    public FuncionarioAuteticavel(String nome, double salario, int senha) {
        this(nome, salario);
        setSenha(senha);
    }
    public void setSenha(int senha){
        this.senha = senha;  
    }
    public final boolean autentica(int senha) {
        return this.senha == senha;
    }
}
