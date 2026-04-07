public class Cow implements Animal{
    private Integer legs;
    private String sound;
    private String food;
    
    public Cow() {
        this.legs = 4;
        this.sound = "Moo" + "\n";
        this.food = "Grass" + "\n";
    }
    
    public Integer getLegs() {
        return legs;
    }
    
    public String getFood() {
        return food;
    }
    
    @Override
    public String getType(){
        return "Cow";
    }
    
    public void setSound(String sound) {
        this.sound = sound;
    }
    
    @Override
    public void makeSound() {
        System.out.println(sound);
    }
    
    @Override
    public Animal clone() {
        try {
            return (Cow) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}