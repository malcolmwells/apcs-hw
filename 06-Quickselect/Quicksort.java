public class Quicksort{
    public static int[] Quicksort(int[]  A, int low, int high){
	if(A.length<=1){
	    return A;
	} else {
	    int pivA = (int)(Math.random()*(high-low))+low;
	    int[] r1 = Quicksort(A, low, pivot-1);
	    int[] r2 = Quicksort(A, pivot+1, high);