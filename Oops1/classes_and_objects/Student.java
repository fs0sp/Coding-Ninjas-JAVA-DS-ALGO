
package classes_and_objects;

public class Student {
    String name;
    private int rollNumber;

    //constructor

    public Student(String n, int rn) {
        name = n;
        rollNumber = rn;
    }

    public Student(String n) {
        name = n;
    }

    public void setRollNumber(int rn) {
        if(rn <= 0) {
            return; // it will return default value i.e 0 if entered rn is < 0
        }
        rollNumber = rn;
    }
 
    public int getRollNumber() {
        return rollNumber;
    }

    public void print() {
        System.out.println(name + " : " + rollNumber);
    }

}