import java.util.*;

class Student {
    String name;
    int age;
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String toString() {
        return this.name + " " + this.age  ;
    }
}

class SortByNameAge implements Comparator<Student> {
    public int compare(Student a, Student b) {
        int nameComp = a.name.compareTo(b.name);
        int ageComp = a.age - b.age;
        if (nameComp == 0) {
            if (ageComp == 0) {
               return nameComp;
            }
            return ageComp;
        }
        else {
            return nameComp;
        }
    }
}

public class Main
{
	public static void main(String[] args) {
	    ArrayList<Student> al = new ArrayList<>();
	    Student obj1 = new Student("Ajay", 27); 
        Student obj2 = new Student("Sneha", 23); 
        Student obj3 = new Student("Simran", 37); 
        Student obj4 = new Student("Ajay", 22); 
        Student obj5 = new Student("Ajay", 29); 
        Student obj6 = new Student("Sneha", 22); 
  
        al.add(obj1); 
        al.add(obj2); 
        al.add(obj3); 
        al.add(obj4); 
        al.add(obj5); 
        al.add(obj6); 
        
        // for (int i = 0; i < al.size(); i++) {
        //     System.out.println(al.get(i));
        // }
        
        Collections.sort(al, new SortByNameAge());
        
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
        
	}
}
