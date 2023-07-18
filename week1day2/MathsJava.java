package week1day2;

public class MathsJava {
	public int add (int a, int b) {
		return(a+b);
	}
	public int multiple (int a, int b) {
		return(a*b);
	}
	public float divide (float a, float b) {
		return(a/b);
	}
	

	public static void main(String[] args) {
	//className object =new classname();
		MathsJava ao = new MathsJava();
		System.out.println("Addition of two numbers");
		System.out.println("The result is " + "" + ao.add(12, 14));
		//To segregrate the next operation by using line space
		System.out.println();
		System.out.println("multiplication of two numbers");
		System.out.println("The result is "+"" +ao.multiple(16, 18));
		System.out.println();
		System.out.println("Dividing of decimal numbers");
		System.out.println("The result is "+ "" + ao. divide (2.5f ,4.5f ));
		
		
		

		

	}

}
