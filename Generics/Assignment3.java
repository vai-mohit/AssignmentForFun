public class Assignment3 {
    public static <Any> void exchange(Any arr[],int index1,int index2){
        Any temp = arr[index2];
        arr[index2] = arr[index1];
        arr[index1] = temp;
    }
    public static void main(String[] args) {
        Integer arr[] = {10,20,30,40,50};
        exchange(arr,2,4);
        for(Integer a: arr)
            System.out.println(a);
        String arr2[] = {"AB","BC","CD","DE","EF"};
        exchange(arr2,2,4);
        for(String a: arr2)
            System.out.println(a);
    }
}
