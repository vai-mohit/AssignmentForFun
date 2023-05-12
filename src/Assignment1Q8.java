class BubbleSort{

    public int[] bubbleSort(int[] arr) {
        int temp2 = 1;
        int len = arr.length;
        while ( temp2==1 && len != 0) {
            temp2 = 0;
            for (int i = 0; i < len - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    temp2 = 1;
                }
            }
            len--;
        }

        return arr;
    }
}
public class Assignment1Q8 {
    public static void main(String args[]) {
        int arr[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        for(int a: new BubbleSort().bubbleSort(arr)){
            System.out.print(a+" ");
        }
    }
}