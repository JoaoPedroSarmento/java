package modelo;

// final indica que uma classe não pode ser herdada, um método não pode ser reescrito e um atributo não pode ser alterado
public final  class SistemaInterno {
    private int senhaDoSistema;
    public SistemaInterno(int senhaDoSistema){
        this.senhaDoSistema = senhaDoSistema;
    }
    public void login (Autenticavel a){
        if(a.autentica(senhaDoSistema))
            System.out.println("Acesso liberado");
        else 
          System.out.println("Acesso negado");
    }
}