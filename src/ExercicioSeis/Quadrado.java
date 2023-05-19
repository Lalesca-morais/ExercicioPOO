package ExercicioSeis;
public class Quadrado {
    private double base = 3;
    private double altura = 3;
    public void Quadrado(double ladoBaseConstrutor, double ladoAlturaConstrutor) {
        this.base = ladoBaseConstrutor;
        this.altura = ladoAlturaConstrutor;
    }
        public void setBase(double ladoBaseConstrutor) {
            this.base = ladoBaseConstrutor;
        }
        public void setAltura(double ladoAlturaConstrutor) {
            this.altura = ladoAlturaConstrutor;
        }
        public double getBase() {
            return base;
        }
        public double getAltura() {
            return altura;
        }
    public double calcularAreaQuadrado() {
        return base * altura;
    }
}
