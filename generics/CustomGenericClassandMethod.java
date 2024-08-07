package generics;

import java.util.List;

public class CustomGenericClassandMethod<T> {

	T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
	
	public static <E> void  printArrGeneric(E[] arr) {
		
		for(E e:arr)
			System.out.println(e);
	}
	
	public static void check(List<? super Number> list) {
		
	}
	
	public static void main(String[] args) {
		
		CustomGenericClassandMethod<String> type=new CustomGenericClassandMethod<>();
		
		type.setObj("a");
		type.getObj();
		
		Integer ar[]={1,2,3,4,};
		printArrGeneric(ar);
		
		Character ch[] = null;
		printArrGeneric(ch);
	
	
	
}
}