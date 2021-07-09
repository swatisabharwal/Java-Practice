package javaConcepts;

public class StringReverseWithoutBuffer {

	public static void main(String[] args) {
		// TODO demonstrate string reverse with and without StringBuffer class
		
		char[] input= {'h','e','l','l','o'};
//	char[] output =new char[input.length];
//		for(int i=input.length-1;i>=0;i--) {
//			output[i]=input[i];
//		System.out.print(output[i]);
//		}
		int i = 0, j = input.length-1;
		while(i<=j){
		char temp =input[i];
		input[i] = input[j];
		input[j] = temp;
		i++;
		j--;
		}
		//System.out.println("OUTPUT= "+output.toCharArray());

	}

}
