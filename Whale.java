public class Whale extends Animal {

    public Whale() {
      super("Whale");
    }

    public String eat() {
        hunger = 1;
        return "The whale gulps plankton";
    } 

    public String getName() {
        return "Whales dont have names, dummy";
    };  
}
