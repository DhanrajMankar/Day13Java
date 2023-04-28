package pc_1;

public class Main {
	
	  public static void main(String[] args) {
	        Generics<String, Integer> gen1 = new Generics<String, Integer>("Sourabh", 100);
	        gen1.printData();
	        System.out.println("--------------------------------------------------------------");
	        Generics<Integer, Double> gen2 = new Generics<Integer, Double>(100, 120.20);
	        gen2.printData();
	        System.out.println("--------------------------------------------------------------");
	       
	        Generics<Boolean, Character> gen3 = new Generics<Boolean, Character>(true, 'B');
	        gen3.printData();
	        System.out.println("--------------------------------------------------------------");
	       
	        Student sachin = new Student("Sachin", 12, 'A');
	        Generics<String, Student> gen4 = new Generics<String, Student>(sachin.getName(), sachin);
	        gen4.printData();

	    }

}
