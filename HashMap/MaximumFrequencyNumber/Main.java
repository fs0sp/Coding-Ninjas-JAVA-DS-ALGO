/*

    You are given with an array of integers that contain numbers in random order.
    Write a program to find and return the number which occurs maximum times in the given input.
    If more than one element occurs same number of times in the input, 
    return the element which is present in the input first.
    
    Sample : 4
             8, 2 ,3 8
             8

*/
import java.util.*;
public class Main
{
    public static int maxNumber(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        int number = 0;
        
        for(int i=0;i<arr.length;i++) {
            if(map.containsKey(arr[i])) {
                map.put(arr[i],map.get(arr[i])+1);
            } else {
                map.put(arr[i],1);
            }
        }
        
        for(int i=0;i<arr.length;i++) {
            if(map.get(arr[i]) > max) {
                max = map.get(arr[i]);
                number = arr[i];
            }
        }
        
        return number;
        
    }
    
	public static void main(String[] args) {
		int arr[] = {3,1,2,3,3,2,3,4,5,2};
		System.out.println(maxNumber(arr));
	}
}
