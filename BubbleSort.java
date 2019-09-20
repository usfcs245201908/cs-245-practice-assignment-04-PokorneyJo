public class BubbleSort implements SortingAlgorithm{

	public void swap(int[] a, int pos1, int pos2){
		int temp = a[pos1];
		a[pos1] = a[pos2];
		a[pos2] = temp;
	}

	public void sort(int[] a){
		int n = a.length;
		for(int i = 0; i< n-1; i++){
			for(int j = 0; j< n-i-1 ; j++){
				if(a[j] > a[j+1]){
					swap(a, j, j+1);
				}
			}
		}
	}
}