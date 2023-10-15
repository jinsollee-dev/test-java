package array1;

import java.util.ArrayList;

public class StudentArrayList {

	public static void main(String[] args) {
	    ArrayList<Student> al = new ArrayList<Student>(); // arraylist선언 
	    al.add(new Student(1001, "James")); 
	    al.add(new Student(1002, "Tomas")); 
		al.add(new Student(1003, "Edward"));

		 for(int i = 0; i<al.size(); i++) {
		     
		     al.get(i).showStudentInfo();
		     }
		
		
 }
}
