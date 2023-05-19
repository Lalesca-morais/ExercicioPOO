package ExercicioQuatro;
public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();

        System.out.println(ContaCorrente.toString());
        ContaCorrente.depositoConta(50);

        System.out.println(ContaCorrente.toString());
        ContaCorrente.saqueConta(150);

        ContaCorrente.numeroDaConta = 9876;
        ContaCorrente.nomeCorrentista = Maria;
        ContaCorrente.saldo = 1000;

        System.out.println("Saldo atual" +saldo);
    }
}
