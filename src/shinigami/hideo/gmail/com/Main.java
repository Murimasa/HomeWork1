package shinigami.hideo.gmail.com;

import java.util.Arrays;

import exception.ExtraStudent;

public class Main {

	public static void main(String[] args) {

		Human h1 = new Human("Mike", "Tsaaryov", 32, "m");
		Group group1 = new Group();
		try {
			group1.addStudent(new Student("Vasya", "Pupkin", 23, "m", 85));
			group1.addStudent(new Student("Alina", "Basik", 19, "f", 96));
			group1.addStudent(new Student("Kolya", "Motveev", 29, "m", 56));
			group1.addStudent(new Student("Nina", "Zaiceva", 25, "f", 78));
			group1.addStudent(new Student("Vasya", "Lodochkin", 16, "m", 89));
			group1.addStudent(new Student("Vitya", "Motrosov", 25, "m", 85));
			group1.addStudent(new Student("Vova", "Lapkin", 31, "m", 74));
			group1.addStudent(new Student("Marina", "Arbenina", 22, "f", 65));
			group1.addStudent(new Student("Fedor", "Arbazov", 18, "m", 78));
			group1.addStudent(new Student("Nikita", "Grigorec", 33, "m", 99));
		} catch (ExtraStudent e) {
			e.printStackTrace();
		}
		group1.print();

		group1.goarmy();
		System.out.println(Arrays.deepToString(group1.goarmy()));
		group1.sortLN(true);
		
		System.out.println();
		group1.print();
		group1.deleteStudent("Arbenina");
		//try {
			//group1.addST();
		//} catch (ExtraStudent e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		//}
		group1.sortLN(true);
		System.out.println();
		group1.print();

	}

}