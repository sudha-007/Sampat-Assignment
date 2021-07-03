import java.util.*;
import java.util.Scanner;

//import com.sun.tools.javac.util.List;

public class TestEmployee {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		List<Employee> arr=new ArrayList<>();
		System.out.println("Enter the value of 'n'");
		int n=input.nextInt();
		input.nextLine();
		for(int i=0;i<n;i++) {
			System.out.println("Enter Name,Age,Salary,Id");
			String name=input.nextLine();
			int age=input.nextInt();
			input.nextLine();
			String salary=input.nextLine();
			int Id=input.nextInt();
			input.nextLine();
			Employee obj=new Employee(salary,Id,name,age);
			arr.add(obj);
		}
		int I=1;
		for(Employee obj:arr) {
			System.out.println("--------------------------------------------------------------------------");
			System.out.println("Employee no. "+I);
			obj.showDetails();
			System.out.println("--------------------------------------------------------------------------");

			I++;
		}
	}

}
