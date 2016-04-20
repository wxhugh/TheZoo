public abstract class Pet extends Animal {
    private String name;
    
    public Pet(String type, String myName) {
        super(type);
        name = myName;
    }    
    public String getName() {
        return name;
    }
    
}
        
    
    