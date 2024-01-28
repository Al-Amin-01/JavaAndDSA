import java.util.*;
public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<n-1;i++){
            int ind=i;
            for(int j=i+1;j<n;j++){
                if(arr[ind]>arr[j]){
                    ind=j;
                }
            }
            int tmp=arr[ind];
            arr[ind]=arr[i];
            arr[i]=tmp;
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
