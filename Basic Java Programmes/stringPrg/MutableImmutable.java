package stringPrg;

public class MutableImmutable {

	public static void main(String[] args) {
		
		String s1=new String("Java");
		StringBuffer buffer=new StringBuffer("Java");
		StringBuilder builder=new StringBuilder("Java");
		
		s1.concat("is awesome");
		buffer.append("is awesome");
		builder.append("is awesoem");
		
		System.out.println(s1);
		System.out.println(buffer);
		System.out.println(builder);
		
		new MutableImmutable().show();

	}
	
	void show() {
		
		String s1=new String("Java");
		StringBuffer buffer1=new StringBuffer("Java");
		StringBuilder builder1=new StringBuilder("Java");
		StringBuffer b=new StringBuffer();
		
		String s2=new String("Java");
		StringBuffer buffer2=new StringBuffer("Java");
		StringBuilder builder2=new StringBuilder("Java");
		
		System.out.println(s1.equals(s2));
		System.out.println(buffer1.equals(buffer2));
		System.out.println(builder1.equals(builder2));
		
		System.out.println(buffer1.toString().equals(buffer2.toString()));
		System.out.println(buffer1.capacity());
		System.out.println(b.capacity());
		System.out.println(buffer1.reverse());
		
		System.out.println("\"Hello "+s1+"!\"");
		

		
	}

}
