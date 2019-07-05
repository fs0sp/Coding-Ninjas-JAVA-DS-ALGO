import java.util.Scanner;

 class PolynomialTest {
    
/* Signature of four required functions is given in the code. You can create other functions as well if you need.
*  Also you should submit your code even if you are not done with all the functions. 
*/

// Main used internally is shown here just for your reference.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int degree1[] = new int[n];
        for(int i = 0; i < n; i++){
            degree1[i] = s.nextInt();
        }
        int coeff1[] = new int[n];
        for(int i = 0; i < n; i++){
            coeff1[i] = s.nextInt();
        }
        Polynomial first = new Polynomial();
        for(int i = 0; i < n; i++){
            first.setCoefficient(degree1[i],coeff1[i]);
        }
        n = s.nextInt();
        int degree2[] = new int[n];
        for(int i = 0; i < n; i++){
            degree2[i] = s.nextInt();
        }
        int coeff2[] = new int[n];
        for(int i = 0; i < n; i++){
            coeff2[i] = s.nextInt();
        }
        Polynomial second = new Polynomial();
        for(int i = 0; i < n; i++){
            second.setCoefficient(degree2[i],coeff2[i]);
        }
        int choice = s.nextInt();
        Polynomial result;
        switch(choice){
        // Add
        case 1: 
            result = first.add(second);
            result.print();
            break;
        // Subtract	
        case 2 :
            result = first.subtract(second);
            result.print();
            break;
        // Multiply
     /*   case 3 :
            result = first.multiply(second);
            result.print();
            break;
         } */

    }

}
 }

 class Polynomial {

    private int degree[];
    private int coefficient[];
    /* This function sets coefficient for a particular degree value, if degree is not there in the polynomial
    *  then corresponding term(with specified degree and value is added int the polynomial. If the degree
    *  is already present in the polynomial then previous coefficient is replaced by
    *  new coefficient value passed as function argument
    */
    public void setCoefficient(int degree, int coeff){
        coefficient[degree] = coeff;

    }

    // Prints all the terms(only terms with non zero coefficients are to be printed) in increasing order of degree. 
    public void print(){
        for(int i=0;i<coefficient.length;i++) {
            if(coefficient[i] != 0 ) {
                System.out.println(coefficient[i] + "x ");
            }
        }
    }


    // Adds two polynomials and returns a new polynomial which has result
    public Polynomial add(Polynomial p){
        Polynomial resultAdd = new Polynomial();
        int sum;
        for(int i=0;i<p.coefficient.length;i++) {
            sum = coefficient[i] + p.coefficient[i];
            resultAdd.setCoefficient(i, sum);
        }
        return resultAdd;
    }

    // Subtracts two polynomials and returns a new polynomial which has result
    public Polynomial subtract(Polynomial p){
        Polynomial resultSub = new Polynomial();
        int sub;
        for(int i=0;i<p.coefficient.length;i++) {
            sub = coefficient[i] - p.coefficient[i];
            resultSub.setCoefficient(i,sub);
        }
        return resultSub;
    }

    // Multiply two polynomials and returns a new polynomial which has result
   // public Polynomial multiply(Polynomial p){

    //}

}

