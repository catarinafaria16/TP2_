public class Automovel {
    private String matricula;
    private String marca;
    private int cilindrada;
    private static int totalAutomoveis = 0;

    public Automovel(String matricula, String marca, int cilindrada) {
        this.matricula = matricula;
        this.marca = marca;
        this.cilindrada = cilindrada;
        totalAutomoveis++;
    }
    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public int getCilindrada() {
        return cilindrada;

    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    public String toString() {
        return "O automóvel com matrícula " + matricula + " é um " + marca + " de " + cilindrada + "cc.";
    }
    public static int getTotalAutomoveis() {
        return totalAutomoveis;
    }
}
