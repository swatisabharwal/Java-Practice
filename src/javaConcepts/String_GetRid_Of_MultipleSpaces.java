package javaConcepts;
import java.util.Scanner;
import java.util.StringTokenizer;
public class String_GetRid_Of_MultipleSpaces {

	public static void main(String[] args) {
		// TODO Get rid of multiple spaces from a string
		String input = "Try                 to            remove   extra   spaces.";
		StringTokenizer substr = new StringTokenizer(input, " ");
     
		StringBuffer sb = new StringBuffer();
        
        while(substr.hasMoreElements()){
            sb.append(substr.nextElement()).append(" ");
        }
        
        System.out.println("Actual string: " + input);
        System.out.println("Processed string: " + sb.toString().trim());
	}

}
