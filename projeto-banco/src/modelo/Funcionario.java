package modelo;
public abstract class Funcionario {
    private String nome;
    private double salario;
    private int senha;
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
    public Funcionario(String nome , double  salario, int senha){ 
        this(nome, salario);
        this.setSenha(senha);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }
    public void setSenha(int senha){
        this.senha = senha;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public abstract double getBonificacao();
}
