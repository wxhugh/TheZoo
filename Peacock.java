public class Peacock extends Animal implements FreeRoam , Performer{
	public Peacock() {
		super("Peacock");
	}

	public String eat() {
		return "The dolphin eats it's feed";
	}

	public String roaming() {
		return "Walk\nRun";
	}
	public String stuntList() {
		return "Peck\nChase";
	}

	public void doRoam(String roam) {
    if (roam.equals("Walk")) {
    	System.out.println("The peacock is walking around the zoo.");
    }
    else if (roam.equals("Run")) {
    	System.out.println("The peacock is running around the zoo.");
    }
    else {
    	System.out.println("The peacock doesn't want to " + roam + " so it is standing still.");
    }
  }
  public void doStunt(String stunt) {
    if (stunt.equals("Peck")) {
    	System.out.println("The peacock pecks at the person.");
    }
    else if (stunt.equals("Chase")) {
    	System.out.println("The peacock chases the person.");
    }
    else {
    	System.out.println("The peacock doesn't understand what to do so it walks away..");
    }
  }

}