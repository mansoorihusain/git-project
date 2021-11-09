import javax.print.event.PrintEvent;

class Sample{
    public static void main(String[] args) {
        int arr[] = {4,7,2,9,8,1,5,6};
        int temp;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp  = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp; 
                    // array sort is complete
                }
            }
        }
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Array sort successfully");
    }
}