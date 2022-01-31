package OOP;

public class Procedural {

	public static void main(String[] args) {
		int number_1=15;
		int number_2=10;
		int result = sum(number_1,number_2);
		System.out.println(result);

	}
	public static int sum(int num_1, int num_2)
	{
		
		int sum=num_1+num_2;
		
		return sum;
	}
}
