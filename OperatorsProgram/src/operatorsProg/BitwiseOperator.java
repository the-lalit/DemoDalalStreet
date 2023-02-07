package operatorsProg;

public class BitwiseOperator {

	public static void main(String[] args) 
	{
		//AND operator
		System.out.println((30>20)&(25<20)); // T&F = F
		System.out.println ((50>20)&(30>15)&(10>5)); // T

		//OR operator
		System.out.println((5>2)|(20>30)); // T|F = T
		System.out.println ((15<10)|(10<5)); // F|F = F
		
		//XOR Operator
		System.out.println ((40>30)^(10!=50)); // T^T = F
		System.out.println ((40<30)^(10!=50)); // F^T = T
	}

}
