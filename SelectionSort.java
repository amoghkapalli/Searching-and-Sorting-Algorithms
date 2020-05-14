    public class SelectionSort {
    void select(int arr[]){
        int len = arr.length;
        for (int i=0; i<len-1; i++){
            int minimum_ind=i;
            for(int j=i+1; j<len; j++){
                if (arr[j]< arr[minimum_ind]){
                    minimum_ind=j;
                }
            }
                int replacer=arr[minimum_ind];
                arr[minimum_ind]=arr[i];
                arr[i]=replacer;
        }
    }
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i=0; i<n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] ={10, 9, 3, 4984, 848, 494, 495, 394, 985, 395};
        SelectionSort am  = new SelectionSort();
        am.select(arr);
        printArray(arr);
    }
}

