package ExercicioTres;
public class ClassePessoa {
    private String nome;
    private int idade;
    private float crescer;
    private float altura;
    private float peso;
        public ClassePessoa(String nome, int idade,float altura) {
            this.nome = nome;
            this.idade = idade;
            this.altura = altura;
            this.peso = peso;
            this.crescer = crescer;
        }
        public void Envelhecer(int ano) {
            this.idade += ano;
                    if (idade < 21) {
                        crescer = 0.5;
                    }
        }
        public void Engordar(float peso) {
            this.peso += peso;
        }
        public void Emagrecer(float peso) {
            this.peso -= peso;
        }
        public void altura(float altura) {
            this.altura +=altura;
        }
        public String toString() {
            return ("nome: "+ nome + ", idade: "+ idade + ", peso: "+ peso + "e altura: "+ altura);
        }
}
