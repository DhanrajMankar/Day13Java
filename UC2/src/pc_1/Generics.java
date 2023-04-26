package pc_1;

public class Generics<T,U,Z> {

	private T abc;
    private U xyz;
    private Z mno;
    
    

    public Generics(T abc, U xyz, Z mno) {
		super();
		this.abc = abc;
		this.xyz = xyz;
		this.mno = mno;
	}



	public void printData() 
	{
        System.out.println(abc);
        System.out.println(xyz);
        System.out.println(mno);
    }
	
	public void largestFloatNo() 
	{
		
     float n1=(float) abc;
     float n2=(float) xyz;
     float n3=(float) mno;
     float temp=n2;
     if(n1>n2)
     {
    	 temp=n1;
     }
     if(n3>temp)
     {
    	 temp=n3;
     }
     System.out.println("The largest Float No is "+temp);
    }
}
