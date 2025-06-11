public class Abelinha extends Personagem implements IArmamento {

    public Abelinha() {
        super(100); 
    }

    @Override
    public void mover() {
        this.energia -= 1; 
        System.out.println("Abelinha movendo... Energia atual: " + this.energia);
    }

    @Override
    public void fazerSom() {
        System.out.println("Bzzzz!");
    }

    @Override

    public void atacar() {
        System.out.println("Abelinha ataca com uma espada!");
    }
}