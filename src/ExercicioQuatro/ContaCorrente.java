package ExercicioQuatro;
public class ContaCorrente {
    private int numeroDaConta;
    private String nomeCorrentista;
    private double saldo;
    public void conta(int numeroDaConta, String nomeCorrentista, double saldo) {
        this.numeroDaConta = numeroDaConta;
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = saldo;
    }
    public void depositoConta(float valor) {
        this.saldo += valor;
    }
    public String saqueConta(float valor) {
        if (this.saldo >= valor){
            this.saldo -= valor;
        }
        public String toString() {
            return ("Conta: " + numeroDaConta + ", nome do correntista: " + nomeCorrentista + ", saldo: "+ saldo);
        }
    }
}
