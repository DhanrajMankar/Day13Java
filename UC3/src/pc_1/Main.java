package pc_1;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first String");
		String s1=sc.next();
		
		System.out.println("Enter the Second String");
		String s2=sc.next();
		
		System.out.println("Enter the third String");
		String s3=sc.next();
		
		Generics<String,String,String> gen1 = new Generics<String, String,String>(s1,s2,s3);
        gen1.printData();
        gen1.largestIntNo();
	}

}
