import java.lang.Math;
class ArmstrongNumBetweenRange{
    public int[] armstrongNumbersInRange(int min , int max){
        int sol[] = new int[max-min+1];
        int z =0;
        for(int i= min;i<=max;i++){
            int temp = i;
            double sum = 0;
            while(temp>0){
                sum = sum + Math.pow(temp%10,3);
                temp = temp/10;
            }
            if(sum==i){
                sol[z] = i;
                z++;
            }
        }
        return sol;

    }
}

public class Assignment1Q2 {
    public static void main (String [] args) {

        int min = 100;int max = 999;
        System.out.print("Output:");
        int arr[] = new ArmstrongNumBetweenRange().armstrongNumbersInRange(min,max);
        for(int a=0;a<arr.length;a++ ){
            if(arr[a]!=0 && arr[a+1]!=0)
            System.out.print(arr[a]+" ");
            else if(arr[a]!=0) System.out.print(arr[a]);

        }

    }
}