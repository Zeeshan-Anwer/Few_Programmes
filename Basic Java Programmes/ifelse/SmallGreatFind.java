package ifelse;

public class SmallGreatFind {
	
	

	public static void main(String[] args) {
		
		int a=10,b=20,c=30,d=40,e=50;
		
		/*if(a>b & (a>c) & (a>d) & (a>e)) 
		{
			System.out.println("greate is:"+a);
		}
		else if((b>a) & (b>c) & (b>d) & (b>e)) 
		{
			System.out.println("greate is:"+b);
		}
		else if(c>a & (c>b) & (c>d) & (c>e)) 
		{
			System.out.println("greate is:"+c);
		}
		else if(d>a & (d>b) & (d>c) & (d>e)) 
		{
			System.out.println("greate is:"+d);
		}
		else
			System.out.println("greater is "+e);*/
			
		if(a>b)
			if(b>c)
				if(c>d)
					if(d>e) {
						System.out.println("greater is "+a);
						System.out.println("smaller is:"+e);
					}
						else
						{
							System.out.println("greater is "+e);
							System.out.println("smaller is:"+a);
						}
		System.out.println("Helllo");

	

}
}

