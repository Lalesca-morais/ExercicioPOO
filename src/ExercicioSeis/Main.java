package ExercicioSeis;
public class Main {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado();

        System.out.println("Lado A: " + quadrado.getBase());
        System.out.println("Lado B: " + quadrado.getAltura());

        quadrado.setBase(5);
        quadrado.setAltura(5);

        System.out.println("Novo valor da base: " +quadrado.getBase());
        System.out.println("Novo valor da altura: "+quadrado.getAltura());

        double area = quadrado.calcularAreaQuadrado();
        System.out.println("Área: " + area);
    }
}
