package Operator;

public class typeandinceex {

	public static void main(String[] args) {
		
		typeandinceex a= new typeandinceex();
		a.Implicit();
	}
	void Implicit(){
		byte b=10;
		System.out.println(" value:"+b);
		short s=b;
		System.out.println("short value:"+s);		
		s++;
		int i=s++;
		System.out.println("int value:"+i);
		System.out.println("short valueis :"+s);
		long l=i;
		System.out.println("long value:"+(--l));
		float f=l;
		System.out.println("float value:"+(f+b));
		double d=(--f);
		System.out.println("doublt value:"+d);
		show();
		if(!(d==f))
		{
			System.out.println("equal");
			
		}
		else
		{
			System.out.println("not equal");
		}
		
		
	}
	static void show()
	{
		char c='A';
		int a=++c;
		System.out.println(a);
		typeandinceex obj=new typeandinceex();
		String s=obj.meth1();
		System.out.println(s);
		
	}
	String meth1() {
		String S="Implicit casting is done by the comiler automatically";
		return S;
	}
	

}
