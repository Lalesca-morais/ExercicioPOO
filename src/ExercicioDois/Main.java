package ExercicioDois;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ClasseBola ClasseBola = new ClasseBola();
        Scanner entrada = new Scanner(System.in);

        ClasseBola.mostraCor();
        ClasseBola.trocaCor();

        ClasseBola.cor = azul;
        ClasseBola.material = borracha;
        ClasseBola.velocidade = 30;
        ClasseBola.circunferencia = 10;
        ClasseBola.marca = Nike;

        System.out.println("Cor da bola: "+ ClasseBola.cor +", material: " + ClasseBola.material + ", velocidade: "
                + ClasseBola.velocidade + ", circunferencia: "+ ClasseBola.circunferencia + ", marca: " + ClasseBola.marca) ;
    }
}
