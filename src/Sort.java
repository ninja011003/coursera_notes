import java.util.Arrays;

public class Sort {
    public static int[] Selection(int[] a){
        int n= a.length;
        for(int i=0;i<n;i++){
            int min=i;
            for(int j=i+1;j<n;j++)
                if(a[min]>a[j])
                    min=j;
            int temp=a[i];
            a[i]=a[min];
            a[min]=temp;
        }
        return a;
    }
    public static int[] Insertion(int[] a){
        int n= a.length;
        for(int i=0;i<n;i++){
            for(int j=i;j>0;j--){
                if(a[j]<a[j-1]){
                    int temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                }
                else 
                    break;
            }
        }
        return a;
    }
    public static int[] Shell(int[] arr) {
        int n = arr.length;
        for (int gap = n/2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i += 1) {
                int temp = arr[i];
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                    arr[j] = arr[j - gap];
                }
                arr[j] = temp;
            }
        }
        return arr;
    }
    public static int[] Shuffle(int[] arr){
        int n= arr.length;
        for(int i=0;i<n;i++){
            int r = StdRandom.uniformInt(0, i+1);
            int temp=arr[i];
            arr[i]=arr[r];
            arr[r]=temp;
        }
        return arr;
    }
    
    
    public static void main(String[] args) {
        //int[] arr ={1,23,45,12,6,0,0};
        /* 
        int[] arr1 = {12, 34, 54, 2, 3};
        for (int i: arr1) {
            System.out.print(i + " ");
        }
        System.out.println();
        Shell(arr1);
        System.out.println("Sorted array:");
        for (int i: arr1) {
            System.out.print(i + " ");
        }
        Shuffle(arr1);
        System.out.println();
        System.out.println("unSorted array:");
        for (int i: arr1) {
            System.out.print(i + " ");
        }
        */
        //System.out.println(Arrays.toString(Insertion(arr))+" "+Arrays.toString(arr));
    }
}
