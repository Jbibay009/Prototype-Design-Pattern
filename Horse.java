public class Horse implements Animal{
    private Integer legs;
    private String sound;
    private String food;
    private String color;
    
    public Horse() {
        this.legs = 4;
        this.sound = "Neigh" + "\n";
        this.food = "Hay";
        this.color = "Brown" + "\n";
    }
    
    public Integer getLegs() {
        return legs;
    }
    
    public String getFood() {
        return food;
    }
    
    public String getColor() {
        return color;
    }
    
    @Override
    public String getType(){
        return "Horse";
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    @Override
    public void makeSound() {
        System.out.println(sound);
    }
    
    @Override
    public Animal clone() {
        try {
            return (Horse) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}