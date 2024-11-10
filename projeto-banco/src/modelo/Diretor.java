package modelo;
public class Diretor extends Gerente {
    public Diretor(String nome , double salario){
        super(nome , salario);
    }
    public Diretor(String nome, double salario, int senha) {
        super(nome, salario, senha);
    }

    @Override
    public double getBonificacao() {
        return getSalario() * 0.20; 
    }
}
