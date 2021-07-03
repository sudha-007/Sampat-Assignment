import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n=input.nextInt();
		int[][] records=new int[n][];
		for(int i=0;i<n;i++) {
			System.out.println("Enter subject for "+(i+1)+"st student:");
			int sub=input.nextInt();
			records[i]=new int[sub];
			for(int j=0;j<sub;j++) {
				int mark=0;
				System.out.println("Enter marks for "+(j+1)+"th subject:");
				mark=input.nextInt();
				records[i][j]=mark;
			}
		}
		int stud=1;
		for(int[] i:records) {
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("Marks of student "+stud);
			int avg=0;
			int count=1;
			for(int j:i) {
				System.out.print(j+"  ");
				avg+=j;
				count++;
			}
			System.out.println("Average Marks:"+avg/count);
		}
		input.close();
	}
}
