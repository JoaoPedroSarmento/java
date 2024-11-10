package modelo;
public class SecretariaGerencia extends Secretaria {
    public SecretariaGerencia(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double getBonificacao() {
        return getSalario() * 0.12; 
    }
}
