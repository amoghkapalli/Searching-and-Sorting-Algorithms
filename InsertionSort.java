public class InsertionSort {
        void insert(int arr[]){
            int len = arr.length;
            for (int i=0; i<len; i++){
                int replacer=arr[i];
                int j=i-1;
                while(j>=0 && arr[j]>replacer){
                    arr[j+1]=arr[j];
                    j=j-1;
                }
                arr[j+1]=replacer;
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
            InsertionSort ins  = new InsertionSort();
            ins.insert(arr);
            printArray(arr);
        }
}
