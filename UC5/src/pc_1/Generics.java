package pc_1;

import java.util.Arrays;

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
	
	public void largetNo()
	{
		 int n1=(int) ab1;
	     int n2=(int) ab2;
	     int n3=(int) ab3;
		 int n4=(int) abc;
	     int n5=(int) xyz;
	     int n6=(int) mno;
		int arr[]= {n1,n2,n3,n4,n5,n6};
		Arrays.sort(arr);
		System.out.println("The largest no is = "+arr[5]);
	}
	
}
