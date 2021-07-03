import java.util.Arrays;

public class Student {
	private String name;
	private int age;
	private int marks[];
	
	void setDetails(String name, int age, int marks[]) {
		this.name=name;
		this.age=age;
		this.marks=marks;
	}
	void display() {
		System.out.println("Student Name- "+this.name);
		System.out.println("Student Age- "+this.age);
		System.out.println("Student Marks- "+Arrays.toString(marks));

	}
	public static void main(String[] args) {
		Student obj=new Student();
		int[] marks={23,44,55,46,36};
		//marks= {23,44,55,46,36};
		obj.setDetails("Anuj Singh", 20, marks);
		obj.display();
	}
}
