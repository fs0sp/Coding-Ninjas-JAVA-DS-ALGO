public class solution {

	public static void mergeSort(int[] input) {
    mergeSort(input,0,input.length-1);
}

public static void mergeSort(int[] input,int startindex, int endindex) {
    if(startindex >= endindex) {
        return;
    }
    int mid = (startindex+endindex)/2;
    mergeSort(input,startindex,mid);
    mergeSort(input,mid+1,endindex);
    merge(input,startindex,endindex);
    
}

public static void merge(int input[],int s,int e) {
    int mid = (s+e)/2;
    int i=s,j=mid+1,k=0;

    int output[] = new int[input.length];
    while(i<=j) {
        if(input[i] <= input[j] ) {
            output[k] = input[i];
            i++;
            k++;
        } else {
            output[k] = input[j];
            k++;
            j++;
        }
    }
    i=0;
    while(i<=k) {
        input[i] = output[i];
        i++;
    }

    
}
