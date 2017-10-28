public class WithoutMainFunction{
	static{
		//This is a static initialization block
		//The Program controls will first enter here
		System.out.println("Hello World!");
		//We are printing hello world to test our code
		System.exit(0);
		//before the controls goes out of the static block
		//we terminate the program successfully
	}
}
