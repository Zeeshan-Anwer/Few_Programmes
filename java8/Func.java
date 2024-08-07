package java8;

import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Func {
	
	public static void main(String[] args) {
		
		Predicate <Integer> pr = (i)->  i %2 ==0;
		System.out.println(pr.test(4));
		
		BiPredicate <Integer,Integer> ps= (i,j) -> i > j;
		System.out.println(ps.test(4,5));
		
		Consumer <String> name=(i) -> System.out.println(i);
		name.accept("Zeeshan");
		
		
		Function <Integer,String> data=(num) -> {
			
			if(num==1)
				return "Zeeshan";
			else
				return "Nothing";
		};
		System.out.println(data.apply(1));
		
		Supplier <String> show= () -> {
			return "Zeeshan";
		};
		System.out.println(show.get());
	}

}
