public class AnimalRegistry{
    private Sheep sheepPrototype;
    private Cow cowPrototype;
    private Horse horsePrototype;

    public AnimalRegistry(){
        this.sheepPrototype = new Sheep();
        this.cowPrototype = new Cow();
        this.horsePrototype = new Horse();
    }
    
    public Sheep createSheep(String name) {
        Sheep newSheep = (Sheep) sheepPrototype.clone();
        newSheep.setName(name);
        return newSheep;
    }
    
    public Cow createCow() {
        return (Cow) cowPrototype.clone();
    }
    
    public Horse createHorse() {
        return (Horse) horsePrototype.clone();
    }
}