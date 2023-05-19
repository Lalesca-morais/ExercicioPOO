package ExercicioCinco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Scanner entrada = new Scanner(System.in);

        carro.ligarCarro();
        carro.getPotencia();
        carro.getQtportas();
        carro.marca();
        carro.modelo();

        System.out.println(carro.getPotencia());
        System.out.println(carro.getQtportas());
        System.out.println(carro.getMarca());
        System.out.println(carro.getmodelo());
    }
}
