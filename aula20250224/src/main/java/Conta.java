public class Conta {
    int numero;
    String dono;
    double saldo;
    double limite;
    
    void Imprimir(){
        System.out.println("Numero: "+numero);
        System.out.println("Dono: "+dono);
        System.out.println("Saldo: "+saldo);
        System.out.println("Limite: "+limite);  
    }
    
    void Sacar(double valor_saque){
        saldo -= valor_saque;
    }
    
    void Depositar(double valor_deposito){
        saldo+= valor_deposito;
    }

}
