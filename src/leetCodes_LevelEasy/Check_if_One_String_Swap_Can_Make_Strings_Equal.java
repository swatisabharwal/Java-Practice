package leetCodes_LevelEasy;

import java.util.ArrayList;

public class Check_if_One_String_Swap_Can_Make_Strings_Equal {
	public boolean areAlmostEqual(String s1, String s2) {
		if(s1.length() == 1){
            return s1.equals(s2);
        }
        int start = 0;
        int end = s1.length() - 1;
        int swap = 0;
        boolean record = true;
        while(start <= end){
            if(s1.charAt(start) == s2.charAt(start)){
                start++;
            }else if(s1.charAt(start) != s2.charAt(start)){
                record = false;
                if(s1.charAt(end) == s2.charAt(end)){
                    end--;
                }else{
                    if(s1.charAt(start) == s2.charAt(end) && s1.charAt(end) == s2.charAt(start)){
                        swap++;
                        start++;
                        end--;
                        record = true;
                        if(swap > 1){
                            return false;
                        }
                    }else{
                        return false;
                    }
                }
            }
        }
        return swap <= 1 && record;
    }

	public static void main(String[] a) {
		Check_if_One_String_Swap_Can_Make_Strings_Equal sol = new Check_if_One_String_Swap_Can_Make_Strings_Equal();
		// Solution sol = new Solution();
		boolean areAlmostEqual = sol.areAlmostEqual("bank", "kanb");
		System.out.println("IS Almost equal: " + areAlmostEqual);
	}
}
