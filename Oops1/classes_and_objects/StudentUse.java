
package classes_and_objects;

import java.util.Scanner;

public class StudentUse {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        Student s1 = new Student("Shivam",92);
        s1.print();
        
        Student s2 = new Student("Manisha",121);
        s2.print();
        // Number of students
        System.out.println(Student.numStudents);
    }
}