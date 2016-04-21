public class Dolphin extends Animal implements Performer {
	
	public Dolphin() {
		super("Dolphin");
	}

	public String stuntList() {
		return "Jump\nPlay with Ball";
	}

	public String eat() {
		return "The dolphin eats fish.";
	}

	public String getName() {
		return "Dolphins dont have names.";
	}

	 public void doStunt(String stunt) {
    if (stunt.equals("Jump")) {
      System.out.println("The dolphin jumps out of the water.");
    }
    else if (stunt.equals("Play with Ball")) {
      System.out.println("The dolphin plays with the ball.");
    }
    else {
      System.out.println("The dolphin doesn't know how to " + stunt);
    }
  }
}