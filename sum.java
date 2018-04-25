package bb;
import java.util.Scanner;
public class sum {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter an arry");
		
		
		int [] n1=new int[10];
			n1[0]=scanner.nextInt();
			n1[1]=scanner.nextInt();
			n1[2]=scanner.nextInt();
			n1[3]=scanner.nextInt();
			n1[4]=scanner.nextInt();
			n1[5]=scanner.nextInt();
			n1[6]=scanner.nextInt();
			n1[7]=scanner.nextInt();
			n1[8]=scanner.nextInt();
			n1[9]=scanner.nextInt();
			
			for(int i=0; i< n1.length; i++) {
				int sum=n1[i]+ n1[i];
				System.out.println(sum);	
	}
	}
}
