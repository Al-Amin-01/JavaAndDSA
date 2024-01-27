import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] marks=new int[n];

        for(int i=0;i<n;i++){
            marks[i]=sc.nextInt();

        }
        int x=sc.nextInt();

        for(int i=0;i<marks.length;i++){
            if(marks[i]==x) System.out.println(i);
        }

    }
}
