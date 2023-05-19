package ExercicioUm;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Debito debito = new Debito();
        Credito credito = new Credito();
        Caixa caixa = new Caixa();

        int lancamento = 0, contador = lancamento;
        double saque;

        System.out.println("VALOR DISPONÍVEL: "+saldo);

        System.out.println("Digite quantos lançamentos deseja: ");
        lancamento = entrada.nextInt();

        System.out.println("Informe o valor para saque: ");
        saque = entrada.nextDouble();

        if (saldo > saque) {
            System.out.println("Valor indisponível");
        }else if (saldo < saque) {
            saque = saldo - saque;
        }
    }
}
