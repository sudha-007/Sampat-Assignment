
public class Person {
	public String name;
	public int age;
	
	public void showDetails() {
		System.out.println("Name- "+this.name);
		System.out.println("Age- "+this.age);
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
}
