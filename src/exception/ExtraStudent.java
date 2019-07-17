package exception;

public class ExtraStudent extends Exception {
	public String showText() {
		return ("You put more than 10 students!");
	}

}
