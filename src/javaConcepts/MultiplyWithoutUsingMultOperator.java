package javaConcepts;

public class MultiplyWithoutUsingMultOperator {

	public static void main(String[] args) {
		// TODO Print Multiplication table without using Multiply operator
		
		int num = 3;
		int product = 0;
		for(int i=0; i<10;i++) {
			product= product+num;
			System.out.println(product);
		}
		

	}

}
