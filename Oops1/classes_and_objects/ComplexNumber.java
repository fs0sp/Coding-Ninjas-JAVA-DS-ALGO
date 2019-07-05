package classes_and_objects;

public class ComplexNumber {
    private int real;
    private int imaginary;


    public ComplexNumber(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public int getImaginary() {
        return imaginary;
    }

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }

    public void print() {
        System.out.println(real + " + " + "i" + imaginary );
    }

    public void add(ComplexNumber c2) {
        this.real = this.real + c2.real;
        this.imaginary = this.imaginary + c2.imaginary;
    }

    public void multiply(ComplexNumber c2) {
        int tempReal,tempImaginary;
        tempReal = this.real;
        tempImaginary = this.imaginary;
        this.real = this.real*c2.real - this.imaginary*c2.imaginary;
        this.imaginary =  tempReal*c2.imaginary + tempImaginary*c2.real;
        System.out.println(this.real);
    
    }
/*
    public  ComplexNumber conjugate() {

    }

    public static ComplexNumber add(ComplexNumber c1,ComplexNumber c3) {

    }
*/
}

