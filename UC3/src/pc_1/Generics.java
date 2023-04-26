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
	
	public void largestIntNo() 
	{
		
     String s1=(String) abc;
     String s2=(String) xyz;
     String s3=(String) mno;
     
     String temp="";
     
     int l=s1.length();
     temp=s1;
     
     if(l<s2.length())
     {
    	 temp=s2;
     }
     if(l<s3.length())
     {
    	 temp=s3;
     }
     
     System.out.println("The largest No is "+temp);
    }
}
