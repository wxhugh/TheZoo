public class ZooTest {
  public static void main(String[] args) {
    Zoo myZoo = new Zoo();
    //TODO: Add animals to the Zoo
    // - one Pet (not performer) = Turtle
    //myZoo.addToZoo(new Turtle("Snappy"));
    Turtle turt = new Turtle("Snappy");
    myZoo.addToZoo(turt);
    // - one performer (not pet) = Dolphin
    Dolphin dolph = new Dolphin();
    myZoo.addToZoo(dolph);
    dolph.doStunt("Jump");
  	dolph.doStunt("Play with Ball");
  	dolph.doStunt("Swim");
    // - one performer and pet = Dog
    Dog doge = new Dog("Doge");
    myZoo.addToZoo(doge);
    doge.doStunt("Sit up");
  	doge.doStunt("Beg");
  	doge.doStunt("Roll Over");
    // - one neither = Whale
    Whale whalle = new Whale();
    myZoo.addToZoo(whalle);
    // implements performer and free roam
    Peacock peck = new Peacock();
    myZoo.addToZoo(peck);
    peck.doRoam("Walk");
    peck.doRoam("Run");
    peck.doRoam("fly");
    peck.doStunt("Peck");
    peck.doStunt("Chase");
    peck.doStunt("fly");
    myZoo.rollCall();
  }
}

    
    
