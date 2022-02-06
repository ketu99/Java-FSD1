package Phase1.AssestedPracticeProject;

public class OrderStatistic {

	public static void main(String[] args) {
		KthSmallst ob = new KthSmallst(); 
        int arr[] = {30,11,4,14,20,21,5}; 
        int n = arr.length,k = 3; 
        System.out.println("K'th smallest element is "+ ob.kthSmallest(arr, 0, n-1, k)); 
    }
}

