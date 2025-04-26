public class MainCilindro {
    public static void main(String[] args) {
        Cilindro cil1 = new Cilindro();
        cil1.setRaio(2);
        cil1.setAltura(3);

        Cilindro cil2 =new Cilindro();
        cil2.setRaio(3);
        cil2.setAltura(5);
        System.out.println("\nVolume: " + cil1.calcularVolume());
        System.out.println("Área: " + cil1.calcularArea());

        System.out.println("\nVolume: " + cil2.calcularVolume());
        System.out.println("Área: " + cil2.calcularArea());
    }
}
