package teste;

import modelo.Caixa;
import modelo.Cliente;
import modelo.Gerente;
import modelo.SistemaInterno;
import modelo.Tesoureiro;

public class TestaSistemaInterno {
    public static void main(String[] args) {
        SistemaInterno sistema = new SistemaInterno(123);
      
        Gerente g1 = new Gerente("Ismerio", 4000, 123);
        Gerente g2 = new Gerente("Lucila", 3000, 123);
        Tesoureiro t1 = new Tesoureiro("Davi", 5000, 123);
        Cliente c1 = new Cliente("Evandro" , "12345678910", 123);
    
        sistema.login(t1);
        sistema.login(g1);
        sistema.login(c1);
    }
}
