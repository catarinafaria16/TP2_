public class Cilindro {
    private double raio;
    private double altura;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double calcularVolume() {
        return Math.PI * Math.pow(raio, 2) * altura;
    }

    public double calcularArea() {
        return 2 * Math.PI * raio * (raio + altura);
    }
}
