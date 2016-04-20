public class Dolphin extends Animal implements Performer {
	
	public Dolphin() {
		super("Dolphin");
	}

	public String stuntList() {
		return "Jump/nPLay with Ball";
	}

	public String eat() {
		return "The dolphin eats fish.";
	}

	public String getName() {
		return "Dolphins dont have names.";
	}

	 public void doStunt(String stunt) {
    if (stunt.equals("Jump")) {
      System.out.println(this.getName() + " jumps.");
    }
    else if (stunt.equals("Play with Ball")) {
      System.out.println(this.getName() + " plays with ball.");
    }
    else {
      System.out.println(this.getName() + " doesn't know how to " + stunt);
    }
  }
}