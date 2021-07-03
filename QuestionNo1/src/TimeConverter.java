import java.util.Scanner;

public class TimeConverter {
	public static double getHours(int seconds) {
		return (seconds*1.0/(60*60));
	}
	public static double getMinutes(int seconds) {
		return(seconds*1.0/(60));
	}
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Seconds:");
		int seconds=input.nextInt();
		boolean flag=true;
		while(flag) {
			System.out.println("Enter\n 1-For converting seconds into Hours\n 2-For converting seconds into Minutes\n 3-TO EXIT THE LOOP");
			int in=input.nextInt();
			switch(in) {
			case 1:
				System.out.println("Hours= "+getHours(seconds));
				break;
			case 2:
				System.out.println("Minutes= "+getMinutes(seconds));
				break;
			case 3:
				System.out.println("----------Thanks for using our service----------");
				flag=false;
				break;
			}
		}
		input.close();
	}
}
