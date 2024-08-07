package ExecutionFlow;

public class methodexecutionflow {
	
	String meth1(int a,int b)
	{
		System.out.println(10);
		System.out.println((54+a)-b);
		int value=new methodexecutionflow().meth5();
		System.out.println(value);
		return "java";
		
		
	}
	int meth2(int a)
	{
		System.out.println(75);
		int b=5;
		System.out.println(b-a);
		return(5*5)-b;
		
	}
	void meth3()
	{
		System.out.println("Start");
		System.out.println(new methodexecutionflow().meth4());
		System.out.println(40);
		
	}

	String meth4()
	{
		System.out.println("today is saturday");
		return new methodexecutionflow().meth1(4,8);
		
	}
	int meth5(){
		methodexecutionflow obj =new methodexecutionflow();
		System.out.println(99);
		return obj.meth2(5);
		
	}
	public static void main(String[] args) {
		
		methodexecutionflow aobj=new methodexecutionflow();
		aobj.meth3();
	}

}
