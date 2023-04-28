package pc_1;

public class Student {

	 private String name;
	    private int std;
	    private char div;
	    public Student(String name, int std, char div) {
	        super();
	        this.name = name;
	        this.std = std;
	        this.div = div;
	    }
	    public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	    public int getStd() {
	        return std;
	    }
	    public void setStd(int std) {
	        this.std = std;
	    }
	    public char getDiv() {
	        return div;
	    }
	    public void setDiv(char div) {
	        this.div = div;
	    }
	    @Override
	    public String toString() {
	        return "Student [name=" + name + ", std=" + std + ", div=" + div + "]";
	    }
}
