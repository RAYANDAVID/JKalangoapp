public class App {
    public static void main(String[] args) throws Exception {

        Formiga f = new Formiga();
        System.out.println("--- Formiga ---");
        f.mover();
        f.mover();
        f.mover();
        f.fazerSom();
        f.dormir();
        System.out.println("Energia final da Formiga: " + f.getEnergia());
        System.out.println("----------------\n");


        Kalango k = new Kalango();
        System.out.println("--- Kalango ---");
        k.mover();
        k.mover();
        k.mover();
        k.fazerSom();
        k.dormir();
        System.out.println("Energia final do Kalango: " + k.getEnergia());
        System.out.println("----------------\n");


        Abelinha a = new Abelinha();
        System.out.println("--- Abelinha ---");
        a.mover();
        a.mover();
        a.mover();
        a.fazerSom();
        a.dormir();
        System.out.println("Energia final da Abelinha: " + a.getEnergia());
        System.out.println("----------------\n");
    }
}