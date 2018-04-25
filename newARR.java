package bb;

public class newARR {

	public static void main(String[] args) {
		int [] a1= {5,2,8,23,14};
		int [] a2= {67,32,7,4,61};
		int [] a3=new int[5];
		
		for(int i=0; i<a3.length; i++) {
			a3[i]=a1[i] + a2[i];
			System.out.println(a3[i]);
		}
		
		
		
		
	}

}
