public class SelectionSort implements SortingAlgorithm{

	public void swap(int[] a, int pos1, int pos2){
		int temp = a[pos1];
		a[pos1] = a[pos2];
		a[pos2] = temp;
	}

	int findmin(int[]a, int start){
		int min = start;
		for(int i = start+1; i<a.length; i++){
			if(a[i]<a[min]){
				min = i;
			}
		}
		return min;
	}

	public void sort(int[] a){
		for(int i = 0; i<a.length; i++){
			swap(a, i, findmin(a, i));
		}
	}
}