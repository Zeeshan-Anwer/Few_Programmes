package stringPrg;

public class Abbaprg {

	public static void main(String[] args) {
		
		new Abbaprg().makeAbba("Hi","Bye");
		
		System.out.println(makeOutWord("<<>>","word"));
		

	}
	
	void makeAbba(String a,String b) {
		
		System.out.println(a+b+b+a);
	}
	
	static String makeOutWord(String a,String b) {
		
	//	System.out.println(b.substring(0,3));
		return a.substring(0,2).concat(b).concat(a.substring(2,4));
		
	}

}
