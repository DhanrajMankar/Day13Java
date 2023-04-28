package pc_1;

public class Generics<T,U> {

	private T abc;
    private U xyz;

    public Generics(T abc, U xyz) {
        super();
        this.abc = abc;
        this.xyz = xyz;
    }

    public void printData() {
        System.out.println(abc);
        System.out.println(xyz);
    }
}
