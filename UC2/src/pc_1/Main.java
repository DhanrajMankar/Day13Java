package pc_1;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first no");
		float n1=sc.nextFloat();
		
		System.out.println("Enter the Second no");
		float n2=sc.nextFloat();
		
		System.out.println("Enter the third no");
		float n3=sc.nextFloat();
		
		Generics<Float,Float,Float> gen1 = new Generics<Float,Float,Float>(n1,n2,n3);
        gen1.printData();
        gen1.largestFloatNo();
	}

}
