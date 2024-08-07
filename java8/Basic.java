package java8;

@FunctionalInterface
public interface Basic {
	
	void add();
	
	static void main(String args[]) {
		System.out.println("hi");
	}
	
	default void check() {
		System.out.println("Hello");
	}

	
}
