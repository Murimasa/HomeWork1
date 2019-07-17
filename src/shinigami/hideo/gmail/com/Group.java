package shinigami.hideo.gmail.com;

import java.util.Arrays;

import javax.swing.JOptionPane;

import exception.ExtraStudent;

public class Group implements Voencom {
	private Student[] group = new Student[10];

	public Group() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Group(Student[] group, String name) {
		super();
		this.group = group;

	}

	public Student[] getGroup() {
		return group;
	}

	public void setGroup(Student[] group) {
		this.group = group;
	}

	private int numberOfStudents() {
		int count = 0;
		for (Student students : group) {
			if (students != null) {
				count++;
			}
		}
		return count;
	}

	public void sortLN(boolean forward) {
		Arrays.sort(this.group, new Compare(forward));
	}
	

	public Student search(String studentseach) {
		for (int i = 0; i < group.length; i++) {
			if (group[i] != null && group[i].getSerName().equalsIgnoreCase(studentseach)) {
				System.out.println(group[i]);
				return group[i];
			}
		}
		System.out.println(":(");
		return null;
	}

	public boolean addStudent(Student student) throws ExtraStudent {
		if (student == null) {
			throw new IllegalArgumentException("No student");
		}
		for (int i = 0; i < group.length; i++) {
			if (group[i] == null) {
				group[i] = student;
				return true;
			}
		}
		throw new ExtraStudent();
	}

	public boolean deleteStudent(String lastname) {
		for (int i = 0; i < group.length; i++) {
			if (group[i] != null && group[i].getSerName() == lastname) {
				group[i] = null;
				return true;
			}
		}
		return false;
	}

	public void print() {
		for (Student student : group) {
			System.out.println(student);
		}
		System.out.println();
	}

	@Override
	public String toString() {
		return "Group [group=" + Arrays.toString(group) + "]";
	}

	@Override
	public Student[] goarmy() {
		int n = 0;
		for (Student student : group) {
			if (student != null && student.getGender() == "m" && student.getAge() >= 18 && student.getAge() <= 27) {
				n += 1;
			}
		}

		Student[] goarmy = new Student[n];
		int i = 0;
		for (Student student : this.group) {
			if (student != null && student.getGender() == "m" && student.getAge() >= 18 && student.getAge() <= 27) {
				goarmy[i++] = student;
			}
		}

		return goarmy;
	}

	public void addST() throws ExtraStudent {
		try {
			String name = getName("Input student name");
			String serName = getSerName("Input student lastname");
			int age = getAge("Input age");
			String gender = getGender("Input sex m/f");
			int reiting = getReiting("Input reiting ");
			Student std = new Student(name, serName, age, gender, reiting);
			this.addStudent(std);
		} catch (NullPointerException e) {
			System.out.println("Cancel");
			return;
		}
	}

	private int getAge(String message) throws NullPointerException {
		boolean done = false;
		int age = 0;
		for (; !done;) {
			try {
				age = Integer.valueOf(JOptionPane.showInputDialog(message));
				done = true;
			} catch (NumberFormatException e) {
				JOptionPane.showInternalMessageDialog(null, "Error ");
			}
		}
		return age;
	}

	private String getName(String message) throws NullPointerException {
		boolean done = false;
		String name = "";
		for (; !done;) {
			try {
				name = JOptionPane.showInputDialog(message);
				done = true;
			} catch (NumberFormatException e) {
				JOptionPane.showInternalMessageDialog(null, "Error");
			}
		}
		return name;
	}

	private String getSerName(String message) throws NullPointerException {
		boolean done = false;
		String serName = "";
		for (; !done;) {
			try {
				serName = JOptionPane.showInputDialog(message);
				done = true;
			} catch (NumberFormatException e) {
				JOptionPane.showInternalMessageDialog(null, "Error");
			}
		}
		return serName;
	}

	private String getGender(String message) throws NullPointerException {
		boolean done = false;
		String gender = "";
		for (; !done;) {
			try {
				gender = JOptionPane.showInputDialog(message);
				done = true;
			} catch (NumberFormatException e) {
				JOptionPane.showInternalMessageDialog(null, "Error");
			}
		}
		return gender;
	}

	private int getReiting(String message) throws NullPointerException {
		boolean done = false;
		int reiting = 0;
		for (; !done;) {
			try {
				reiting = Integer.valueOf(JOptionPane.showInputDialog(message));
				done = true;
			} catch (NumberFormatException e) {
				JOptionPane.showInternalMessageDialog(null, "Error ");
			}
		}
		return reiting;
	}
}
