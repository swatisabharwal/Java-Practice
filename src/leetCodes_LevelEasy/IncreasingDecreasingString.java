package leetCodes_LevelEasy;

public class IncreasingDecreasingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Input: s = "aaaabbbbcccc" Output: "abccbaabccba"
		 */
		IncreasingDecreasingString sol = new IncreasingDecreasingString();
		String s = sol.sortString("aaaabbbbcccc");
		System.out.println("sSomething happened, some sort::" + s);
	}

	public String sortString(String s) {
		StringBuilder sb = new StringBuilder();
		int len = s.length();
		char[] ch = s.toCharArray();
		char min= ch[0];
		char max;
		for(int i=1;i<len-1;i++) {
			if(ch[i]<min) {
				min=ch[i];
				sb.append(min);
			}
		}
		return sb.toString();
	}

}
