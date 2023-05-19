package ExercicioTres;

public class Main {
    public static void main(String[] args) {

        ClassePessoa classePessoa = new ClassePessoa("Maria", 30, 170);

        System.out.println(classePessoa.toString());
        classePessoa.Envelhecer(10);

        System.out.println(classePessoa.toString());
        classePessoa.Engordar(15);

        System.out.println(classePessoa.toString());
        classePessoa.Emagrecer(8);
    }
}
