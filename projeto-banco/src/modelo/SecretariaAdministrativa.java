package modelo;
public class SecretariaAdministrativa extends Secretaria {
    public SecretariaAdministrativa(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double getBonificacao() {
        return getSalario() * 0.1; 
    }
}
