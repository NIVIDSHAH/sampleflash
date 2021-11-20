
public class StackTraceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			methodA();
	}
	
	public static void methodA() {
		System.out.println("Method A!");
		methodB();
	}
	
	public static void methodB() {
		System.out.println("Method B");
		methodC();
	}
	
	public static void methodC() {
		System.out.println("Method C");
		int[] array = {0,1,2};
		System.out.println(array[2]);
	}


}
