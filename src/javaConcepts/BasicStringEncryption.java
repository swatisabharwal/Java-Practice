package javaConcepts;

public class BasicStringEncryption {

	public static void main(String[] args) {
		/*
		 * // TODO :Do some basic encryption*
		 *  1. _ instead of space 
		 *  2. 3 instead of e 
		 *  3. a->b ,y->z 
		 *  4. reverse
		 * the String Swapping last character to the first
		 */
		String str = "NainEsh Kasula";
		  StringBuffer buff = new StringBuffer();
		    
		    str= str.replaceAll(" ","_");
		    str= str.replaceAll("e","3");
		    str= str.replaceAll("E","3");
		    System.out.println("Current String"+str+"String Length> "+ str.length());
		 
		    char[] ch =str.toCharArray();
		    char temp= ch[0];
		      ch[0]=ch[ch.length-1];
		      ch[ch.length-1]=temp;
		      //System.out.println(temp);
		    for(char i:ch){
		      if(i!= '_'&& Character.isDigit(i)==false){
		      i++;
		      }
		      
		      buff.append(i);      
		    }
		    buff= buff.reverse();
		    System.out.println(buff);
	}

}
