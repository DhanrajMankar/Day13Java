package pc_1;

public class Generics<A,B,C,T,U,Z> {

	private A ab1;
	private B ab2;
	private C ab3;
	private T abc;
    private U xyz;
    private Z mno;
    
    

    


	public Generics(A ab1, B ab2, C ab3, T abc, U xyz, Z mno) {
		super();
		this.ab1 = ab1;
		this.ab2 = ab2;
		this.ab3 = ab3;
		this.abc = abc;
		this.xyz = xyz;
		this.mno = mno;
	}

	public void printData() 
	{
		System.out.println(ab1);
		System.out.println(ab2);
		System.out.println(ab3);
        System.out.println(abc);
        System.out.println(xyz);
        System.out.println(mno);
    }
	
	
}
