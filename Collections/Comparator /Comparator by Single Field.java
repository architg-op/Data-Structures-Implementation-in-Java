import java.util.*;

class Student {
    int rollno;
    String name;
    String address;
    Student(int rollno, String name, String address) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }
    public String toString() {
        return this.rollno + " " + this.name + " " + this.address  ;
    }
}

class SortbyRoll implements Comparator<Student> {
        public int compare(Student a, Student b) {
            return a.rollno - b.rollno;
        }
}

class SortbyName implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return a.name.compareTo(b.name);
    }
}

public class Main
{
	public static void main(String[] args) {
	    ArrayList<Student> al = new ArrayList<>();
	    al.add(new Student(457, "Adams", "London"));
	    al.add(new Student(387, "Eve", "Argentina"));
	    al.add(new Student(398, "Benjin", "Beijing"));
	   // for (int i = 0; i < al.size(); i++) {
	   //     System.out.println(al.get(i));
	   // }
	   //Collections.sort(al, new SortbyRoll());
	   // for (int i = 0; i < al.size(); i++) {
	   //     System.out.println(al.get(i));
	   //}
	   //Collections.sort(al, new SortbyName());
	   // for (int i = 0; i < al.size(); i++) {
	   //     System.out.println(al.get(i));
	   //}
	   
	}
}
