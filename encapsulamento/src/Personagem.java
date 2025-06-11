public abstract class Personagem {
    protected int energia; 

    public Personagem(int energiaInicial) {
        this.energia = energiaInicial;
    }

    public Personagem() {
        super();
    }

    public abstract void mover();

    public int getEnergia() { 
        return energia;
    }

    public abstract void fazerSom();

    public void dormir() { 
        this.energia += 10;
        System.out.println(getClass().getSimpleName() + " dormindo... Energia aumentou para: " + this.energia);
    }
}