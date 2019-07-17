package shinigami.hideo.gmail.com;

import java.util.Comparator;

public class Compare implements Comparator {
	private boolean forward = true;

	public Compare(boolean forward) {
		super();
		this.forward = forward;
	}

	@Override
	public int compare(Object a, Object b) {

		int n = (this.forward) ? 1 : -1;

		if (a != null && b == null) {
			return 1;
		}
		if (a == null && b != null) {
			return -1;
		}
		if (a == null && b == null) {
			return 0;
		}
		Student studentOne = (Student) a;
		Student studentTwo = (Student) b;

		return (studentOne.getSerName().compareTo(studentTwo.getSerName())) * n;
	}
	

}
