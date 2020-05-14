public class BubbleSort {
    void select(int arr[]){
        int len = arr.length;
        for (int i=0; i<len; i++){
            for (int j=0; j<len; j++){
                if (arr[j]>arr[j+1]){
                    int replacer=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=replacer;
                }
            }
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
        BubbleSort ob = new BubbleSort();
        ob.select(arr);
        printArray(arr);
    }
}