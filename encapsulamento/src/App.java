public class App {
    public static void main(String[] args) throws Exception {
       
        Formiga f = new Formiga();
        f.mover();
        f.fazerSom();

        Kalango k = new Kalango();
        k.mover();
        k.mover();
        k.mover();
        if (mover >= 3) {
            System.out.println("Perdeu -2 de energia!");
        }
        System.out.println("Energia do Kalango: " + k.energia()); // Acesso ao método protegido energia()
        k.fazerSom();
        k.dormir(); // Método protegido, pode ser acessado aqui porque é público na classe Kalango


        Abelinha a = new Abelinha();
        a.mover();
        a.fazerSom();
        a.dormir(); // Método protegido, pode ser acessado aqui porque é público na classe Abelinha

                

    }
}
