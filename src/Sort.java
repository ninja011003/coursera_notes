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
}
