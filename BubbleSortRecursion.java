public class BubbleSortRecursion {
    void recurse(int arr[], int n){

        if(n==1){
            return;
        }
        for (int i=0; i<n-1; i++){
            if (arr[i]>arr[i+1]) {
                int replacer = arr[i + 1];
                arr[i + 1] = arr[i];
                arr[i] = replacer;
            }
            recurse(arr, n-1);
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
        int len = arr.length;
        BubbleSortRecursion amo = new BubbleSortRecursion();
        amo.recurse(arr, len);
        printArray(arr);
    }
}



