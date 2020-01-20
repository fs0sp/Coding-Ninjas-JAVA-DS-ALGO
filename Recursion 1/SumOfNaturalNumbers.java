public class SumOfNaturalNumbers {

    public static int calcN(int n) {

        if(n == 1) {  // BASE CASE
            return 1;
        }

       // int smallAns = calcN(n-1);

        return calcN(n-1) + n;
    }


    public static void main(String[] args) {

        int n = 5;
        int ans = calcN(n);

        System.out.println(ans);

    }

} 