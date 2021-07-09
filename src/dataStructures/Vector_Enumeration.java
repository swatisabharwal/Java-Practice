package dataStructures;
import java.util.Vector;
import java.util.Enumeration;
import java.util.ListIterator;


public class Vector_Enumeration {

	public static void main(String[] args) {
		// TODO Vector Enumeration
		
		 Vector <Object> v= new Vector<Object>();
		    for(int i=0;i<10;i++){
		        v.addElement(i);
		    }
		    Enumeration e =  v.elements();
		    while(e.hasMoreElements()){
		      Integer i= (Integer)e.nextElement();
		      System.out.println(i);
		    }
		    ListIterator lit = v.listIterator();
		    System.out.println("Class name:"+lit.getClass().getName());
		    while(lit.hasNext()) {
		    	System.out.println(lit.next());
		    }

	}
}
	
//	 public static void main(String[] args) {
//		 Vector<Object> v = new Vector<Object>();
//		     v.addElement('s');
//		     v.addElement("tree");
//		     v.addElement(null);
//		     v.addElement("Swati");
//		     v.addElement(7);
//		     
//          System.out.println(v);
	     
//	      Enumeration<Object> en= v.elements();
//		   
//		      while(en.hasMoreElements()){
//		     
//         Object obj=en.nextElement();
//		         System.out.println(obj); 
//		     }
//		  }



