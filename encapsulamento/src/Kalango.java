public class Kalango extends Personagem{

    @Override
    public void mover() {
        System.out.println("Movendo...");
    }

    @Override
    public int energia() {
        return 50; // Kalango tem menos energia que Formiga e Abelinha
    }


    @Override
    public void fazerSom() {
        System.out.println("Tssss!");
    }

    @Override
    public void dormir() {
        System.out.println("Kalango dormindo...");
    }
}
