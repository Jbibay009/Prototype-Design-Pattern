public class Sheep implements Animal{
    private Integer legs;
    private String sound;
    private String food;
    private String name;
    
    public Sheep() {
        this.legs = 4;
        this.sound = "Baaa" + "\n";
        this.food = "Grass";
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public Integer getLegs() {
        return legs;
    }
    
    public String getFood() {
        return food;
    }
    
    @Override
    public String getType(){
        return "Sheep";
    }
    
    @Override
    public void makeSound() {
        System.out.println(sound);
    }
    
    @Override
    public Animal clone() {
        try {
            return (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}