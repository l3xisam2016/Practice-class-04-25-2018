package bb;
import java.util.Scanner;
public class NUMD {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter an arry");
		
		int [] n1= new int[5];
		
		for(int i=0; i<n1.length; i++) {
			n1[i]=scanner.nextInt();
		}
		
		for(int i=0; i<n1.length; i++) {
			
			 if(n1[i]%5==0 && n1[i]%4==0 && n1[i] >10 ) {
				System.out.println(n1[i]); 
		}else {
			
		}
			

	}
	}
}
