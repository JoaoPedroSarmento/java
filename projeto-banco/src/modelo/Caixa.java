package modelo;
public class Caixa extends Funcionario {
    private int numGuiche;

    public Caixa(String nome, double salario, int numGuiche) {
        super(nome, salario);
        this.numGuiche = numGuiche;
    }

    @Override
    public double getBonificacao() {
        return getSalario() * 0.05;
    }
}
