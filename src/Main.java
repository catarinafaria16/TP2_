//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Automovel a1 = new Automovel("11-11-AA", "Toyota",1400);
        System.out.println(a1.toString());
        Automovel a2 = new Automovel("22-22-BB","Fiat",0);
        System.out.println(a2.toString());
        System.out.println("O total de automóveis: " + a1.getTotalAutomoveis());
    }
    }
