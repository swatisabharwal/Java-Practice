package javaConcepts;

public class PangramChecker {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 String phrase =("Pack my box with five dozen liqur jug").toLowerCase();
	 for(char i ='a'; i<='z';i++) {
		 if(phrase.indexOf(i)<0) {
			 System.out.println("pooper");
			 		 }
	 }
	 System.out.println("PANGRAM");
	}

}
