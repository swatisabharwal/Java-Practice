package dataStructures;

import java.util.Comparator;
import java.util.TreeSet;
/*
 * Here for a personalized Class, Default  Sorting order is being defined - by implementing  Comparable interface 
 */

class Employee implements Comparable<Object> {
	String ename;
	int eid;

	Employee(String ename, int eid) {
		this.ename = ename;
		this.eid = eid;
	}

	public String toString() {
		return ename + "--" + eid;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Implement compare to for comparable
		int eid1 = this.eid; // here first employee object is assigned to eid1 > comparison starts from 1
		Employee e = (Employee) o;
		int eid2 = e.eid;
		if (eid1 < eid2) {
			return -1;
		} else if (eid1 > eid2) {
			return +1;
		}
		return 0;
	}

}

class EmployeeSortWithComparator implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		Employee e1 = (Employee) o1;
		Employee e2 = (Employee) o2;
		String s1 = e1.ename;
		String s2 = e2.ename;
		return s1.compareTo(s2);
	}

}

public class TreeSort_Employee_ComparableVsComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1 = new Employee("Swati", 7);
		Employee e2 = new Employee("Sheep", 31);
		Employee e3 = new Employee("Tiger", 2);
		Employee e4 = new Employee("Bull", 11);
		Employee e5 = new Employee("Swati", 7);

		TreeSet<Object> t = new TreeSet<Object>(); // default sorting order - no argument
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		System.out.println("Compareable-Default order > sort based on ID" + t);

		TreeSet<Object> t1 = new TreeSet<Object>(new EmployeeSortWithComparator()); // re-defined sorting order,
																					// comparator t
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		t1.add(e5);
		System.out.println("Customised order - Comparator > sort based on name" + t1);
	}

}
