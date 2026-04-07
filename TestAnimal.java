public class TestAnimal {

    public static void main(String[] args) {
        AnimalRegistry registry = new AnimalRegistry();

        Sheep mySheep = registry.createSheep("Dolly");
        Cow myCow = registry.createCow();
        Horse myHorse = registry.createHorse();

        System.out.println("Animal: " + mySheep.getType() + " named " + mySheep.getName());
        System.out.print("Sound: ");
        mySheep.makeSound();

        System.out.println("Animal: " + myCow.getType());
        System.out.print("Sound: ");
        myCow.makeSound();

        System.out.println("Animal: " + myHorse.getType());
        System.out.print("Sound: ");
        myHorse.makeSound();

        Sheep sheep2 = registry.createSheep("Shaun");
        Cow cow2 = registry.createCow();
        Horse horse2 = registry.createHorse();

        cow2.setSound("Boom!" + "\n");
        horse2.setColor("White" + "\n");

        System.out.println("Animal: " + sheep2.getType() + " named " + sheep2.getName());
        System.out.print("Action: ");
        sheep2.makeSound();

        System.out.println("Animal: " + cow2.getType());
        System.out.print("Sound: " );
        cow2.makeSound();

        System.out.println("Animal: " + horse2.getType() + " with color " + horse2.getColor());
        System.out.print("Sound: ");
        horse2.makeSound();
    }
}
