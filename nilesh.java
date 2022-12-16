
class nilesh
{   
	int nv=10;
	int x;
	String y;
	char z;

	static int sv=20;

	public static void sm()
	{
		System.out.println("static method");
	}
	public void nsm()
	{

		System.out.println("non-static method");
		this.nv=100;
		//obj1.nv=200;
		//System.out.println(obj1.nv);
		System.out.println(this.nv);
		//System.out.println("number is " + x);
	   //System.out.println("name is "+ y);
	   //System.out.println("char is "+ z);
	}
	static
	{
			System.out.println("Block 1");
	      System.out.println("STATIC BLOCK");
	}
	{
	 System.out.println("NON STATIC BLOCK");
	}
	nilesh(int x,String y,char z)
	{
		super();
		this.x=x;
		this.y=y;
		this.z=z;
      // System.out.println("number is " + x);
	   //System.out.println("name is "+ y);
	   //System.out.println("char is "+ z);
		
	}



	public static void main(String[] args) 
	{
		nilesh obj1=new nilesh(5,"nilesh",'a');
		obj1.nv=200;
		System.out.println(obj1.nv);
		System.out.println(obj1.nv);
		System.out.println(sv);
		obj1.nsm();
	}
}
