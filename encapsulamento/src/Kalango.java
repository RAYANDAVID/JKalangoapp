public class Kalango extends Personagem{

    public Kalango() {
        super(50); 
    }

    @Override
    public void mover() {
        this.energia -= 3; 
        System.out.println("Kalango movendo... Energia atual: " + this.energia);
    }

    @Override
    public void fazerSom() {
        System.out.println("Tssss!");
    }

    @Override
    public void dormir() {
        super.dormir();
        System.out.println("Kalango dormindo...");
    }
}