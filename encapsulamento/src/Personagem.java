public abstract class Personagem {

    public abstract void mover();


    protected int energia(){
        return 100;
    }

    public abstract void fazerSom();
    
    void dormir() {
        System.out.println("Dormindo...");
    }
}
