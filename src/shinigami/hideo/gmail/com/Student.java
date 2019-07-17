package shinigami.hideo.gmail.com;

public class Student extends Human{
	private int reiting;
	
	
	public Student() {
		super();
		
	}

	public Student(String name, String serName, int age, String gender, int reiting) {
		super(name, serName, age, gender);
		this.reiting=reiting;
		
	}

	public Student(int reiting) {
		super();
		this.reiting = reiting;
		
	}
	public int getReiting() {
		return reiting;
	}
	public void setReiting(int reiting) {
		this.reiting = reiting;
	}
	@Override
	public String toString() {
		return "Student [reiting= " + reiting + " name= " + getName() + ", serName= " + getSerName() + ", age= " + getAge() + ", gender= " + getGender() + "]";
	}
	
	
	
	

}
