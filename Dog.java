public class Dog extends Pet implements Performer {

  public Dog(String name) {
    super("Dog", name);
  }

  public String stuntList() {
    return "Sit up\nBeg";
  }

  public String eat() {
    return this.getName() + " wolfs down kibble";
  }

  public void doStunt(String stunt) {
    if (stunt.equals("Sit up")) {
      System.out.println(this.getName() + " sits up");
    }
    else if (stunt.equals("Beg")) {
      System.out.println(this.getName() + " begs");
    }
    else {
      System.out.println(this.getName() + " doesn't know how to " + stunt);
    }
  }
}
      



