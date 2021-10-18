public abstract class Conta {

    private double saldo;

    public void deposita(double valor){
        saldo = valor;
    }

    public void saque(double valor){
        saldo -=valor;
        saldo -=this.taxaConta();
    }

    public abstract double taxaConta();

    public double getSaldo() {
        return saldo;
    }
}
