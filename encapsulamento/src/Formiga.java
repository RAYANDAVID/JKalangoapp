public class Formiga extends Personagem implements IArmamento {

    public Formiga() {
        super(100); 
    }

    @Override
    public void mover() {
        this.energia -= 2; 
        System.out.println("Formiga movendo... Energia atual: " + this.energia);
    }

    @Override
    public void fazerSom() {
        System.out.println("Fzzzz!");
    }

    @Override
    public void atacar() {
      System.out.println("Formiga ataca com 4 formas!");
        
    }
    
}