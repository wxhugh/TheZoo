public class Turtle extends Pet {

	public Turtle(String name) {
		super("Turtle",name);
	}
	public String eat() {
		return this.getName() + " the turtle chews leaves";
	}
}