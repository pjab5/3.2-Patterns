package Level1;

public class Main {
    public static void main(String[] args) {

        Pizzaiolo pizzaiolo = new Pizzaiolo();

        PepperoniBuilder pepperoni = new PepperoniBuilder();
        MargheritaBuilder margherita = new MargheritaBuilder();
        pizzaiolo.Pepperoni(pepperoni);
        pizzaiolo.Margherita(margherita);
        Pizza pizza1 = pepperoni.getPizza();
        Pizza pizza2 = margherita.getPizza();
        System.out.println(pizza1.toString());
        System.out.println(pizza2.toString());
    }
}