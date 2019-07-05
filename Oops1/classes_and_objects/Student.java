
package classes_and_objects;

public class Student {
    String name;
    private final int rollNumber;

    private static int numStudents;

    //constructor

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        numStudents++;
    }

    public static int getNumStudents() {
        return numStudents;
    }
     
    public int getRollNumber() {
        return rollNumber;
    }

    public void print() {
        System.out.println(name + " : " + rollNumber);
    }

}