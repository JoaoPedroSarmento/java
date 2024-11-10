package modelo;
public class Conta {
    // private e public são modificadores de acesso 
    
     private  Cliente titular = new Cliente();
     private  int numero;
     private  double saldo;
     // construtor
    //  public Conta(String titular , int numero , double saldo){
    //   this.titular = titular;
    //   this.numero = numero;
    //   this.saldo = saldo;
    //  }
     
    public int getNumero(){
        return this.numero;
    }
    public void setNumero(int numero){
      this.numero = numero;
    }
    public Cliente getTitular(){
        return this.titular;
    }
    public double getSaldo(){
       return this.saldo;
    }
   public boolean saca (double valor){
       if(this.saldo < valor) return false;
       this.saldo -= valor;
       return false;
    }
    public boolean deposita (double valor){
       if(valor <= 0) return false;
       this.saldo += valor;
       return true;
    }
    public boolean tranferePara(Conta contaDestino , double valor){
        if(this.saca(valor)){
            contaDestino.deposita(valor);
            return true;
        } return false;
    }
    public void mostraDados(){
        System.out.println("Conta: " + this.getSaldo());
        System.out.println("Número da conta: " + this.getNumero());
        System.out.println("Títular: " + this.getTitular().getNome());
        System.out.println("Email: " + this.getTitular().getEmail());
        System.out.println("CPF:" + this.getTitular().getCpf());
    }
  }
  