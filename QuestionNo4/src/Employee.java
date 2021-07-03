
public class Employee extends Person{
	private String salary;
	private int id;
	@Override
	public void showDetails() {
		// TODO Auto-generated method stub
		super.showDetails();
		System.out.println("Salary- "+this.salary);
		System.out.println("Id- "+this.id);
	}
	public Employee(String salary, int id,String name, int age) {
		super(name,age);
		this.salary = salary;
		this.id = id;
	}
	
	
	

}
