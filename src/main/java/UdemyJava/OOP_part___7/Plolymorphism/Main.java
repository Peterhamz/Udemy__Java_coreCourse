package UdemyJava.OOP_part___7.Plolymorphism;

public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic","Sausage", 3.56, "White");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Tomatoes", 4.34);
        hamburger.addHamburgerAddition2("bread",4.22);
        hamburger.addHamburgerAddition3("Lettus", 0.55 );
        System.out.println(hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHamburgerAddition1("Egg",34);
        healthyBurger.addHealthyAdditional1("lentils",2.44);
        System.out.println(healthyBurger.itemizeHamburger());
    }
}
