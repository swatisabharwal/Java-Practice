package javaConcepts;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ELmentGreaterThanZeroNotPresentIntheArray{

	public int solution(int[] A) {
		int N=A.length;
		HashSet<Integer> set = new HashSet<Integer>();
		for (int a : A) {
		    if (a > 0) {
		        set.add(a);
		    }
		}
		for (int i = 1; i <= N + 1; i++) {
		    if (!set.contains(i)) {
		        return i;
		    }
		}
		 return 0;
	}
	public static void main(String[] a) {
		ELmentGreaterThanZeroNotPresentIntheArray s = new ELmentGreaterThanZeroNotPresentIntheArray();
		int[] arr = { 1, 3, 6, 4, 1, 2 };
		int num = s.solution(arr);
		System.out.println(num);
	}
}
