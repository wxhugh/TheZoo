public class ZooTest {
  public static void main(String[] args) {
    Zoo myZoo = new Zoo();
    //TODO: Add animals to the Zoo
    // - one Pet (not performer) = Turtle
    myZoo.addToZoo(new Turtle("Snappy"));
    // - one performer (not pet) = Dolphin
    myZoo.addToZoo(new Dolphin());
    // - one performer and pet = Dog
    myZoo.addToZoo(new Dog("Beau"));
    // - one neither = Whale
    myZoo.addToZoo(new Whale());
    myZoo.rollCall();
  }
}
    
    
