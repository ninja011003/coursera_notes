//package coursera_notes.src;

import java.util.Scanner;
public class sample {
    /* 
    public static int NambiNUm(long num){
        int[] arr= new int[10];
        int i=0;
        while(num>0){
            arr[i]=(int)(num%10);
            num/=10;
            i++;
        }
        i=0;
        while(i<5){
            int temp=arr[i];
            arr[i]=arr[9-i];
            arr[9-i]=temp;
            i++;
        }
        i=0;
        while(i<10){
            if(arr[i]%2==0){
                int sum=0;
                do{
                    sum+=arr[i];
                    i++;
                }
                while(sum%2==0&&i<10);
                System.out.print(sum);
            }
            else{
                int sum=0;
                do{
                    sum+=arr[i];
                    i++;
                }
                while(sum%2!=0&&i<10);
                System.out.print(sum);
            }
        }
        return 0;
    }
    */
    /* 
    public static int seriesN(int input1, int input2,int input3,int input4){
        int a= input1;
        int b= input2;
        int c=input3;
        int n= input4;
        if(n==1)
            return a;
        else if(n==2)
            return b;
        else if(n==3)
            return c;
        else{
            System.out.print(a+" "+b+" "+c+" ");
            for(int i=0;i<n-3;i++){
                int temp=c;
                c+=(b-a);
                System.out.print(c+" ");
                a=b;
                b=temp;
            }
        }
        return c;
    }
    */
    /* 
    public static int count(int a[]){
        int count=0;
        int n = a.length;
        for(int i=0;i<n;i++)
            for(int j=i+1;j<n;j++)
                for(int k=j+1;k<n;k++)
                    if(a[i]+a[j]+a[k]==0)
                        count++;
        return count;
    }
    */
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //9880127431
        //NambiNUm(9994276112L);
        //System.out.println(seriesN(1,3,6,100));
        String a="abc";
        int n = a.charAt(0);
        /*  
        int a[]={30,-40,-20,-10,40,0,10,5};
        Stopwatch sw = new Stopwatch();
        System.out.println(count(a)+" "+sw.elapsedTime());
        */
        
    }
}

