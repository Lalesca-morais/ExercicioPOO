package ExercicioCinco;
public class Carro {
    //variáveis
    private int qtportas;
    private double modelo;
    private String marca;
    private double potencia;

    //construtor com atributos
    public void Carro(){
        this.qtportas = qtportas;
        this.modelo = modelo;
        this.marca = marca;
        this.potencia = potencia;
    }
    //métodos
    public void ligarCarro() {
        this.potencia = potencia;
    }
    public void setPotencia() {
        this.potencia = 2.0;
    }
    public double getPotencia() {
        return potencia;
    }
    public void Qtportas(){
        this.qtportas = qtportas;
    }
    public void setQtportas() {
        this.qtportas = 4;
    }
    public int getQtportas() {
        return qtportas;
    }
    public void modelo() {
        this.modelo = modelo;
    }
    public void setModelo() {
        this.modelo = 2006;
    }
    public double getmodelo() {
        return modelo;
    }
    public void marca() {
        this.marca = marca;
    }
    public void setMarca() {
        this.marca = "uno";
    }
    public String getMarca() {
        return marca;
    }
}
