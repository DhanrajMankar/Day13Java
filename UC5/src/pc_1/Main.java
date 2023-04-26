package pc_1;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first no");
		int n1=sc.nextInt();
		
		System.out.println("Enter the Second no");
		int n2=sc.nextInt();
		
		System.out.println("Enter the third no");
		int n3=sc.nextInt();
		
		System.out.println("Enter the fourth no");
		int n4=sc.nextInt();
		
		System.out.println("Enter the fifth no");
		int n5=sc.nextInt();
		
		System.out.println("Enter the sixth no");
		int n6=sc.nextInt();
		
		
		Generics<Integer,Integer,Integer,Integer,Integer,Integer> gen1 = new Generics<Integer, Integer,Integer,Integer,Integer,Integer>(n1,n2,n3,n4,n5,n6);
        gen1.printData();
        gen1.largetNo();
       
	}

}
