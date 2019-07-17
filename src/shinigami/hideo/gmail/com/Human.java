package shinigami.hideo.gmail.com;

public class Human {
	private String name;
	private String serName;
	private int age;
	private String gender;

	public Human() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Human(String name, String serName, int age, String gender) {
		super();
		this.name = name;
		this.serName = serName;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSerName() {
		return serName;
	}

	public void setSerName(String serName) {
		this.serName = serName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", serName=" + serName + ", age=" + age + ", gender=" + gender + "]";
	}

}
