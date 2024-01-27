import java.util.*;
public class Strings {
    public static void main(String[] args) {
        String name1="Jim";
        String name2="Jim";
        //compare two string
        if(name1.compareTo(name2)==0){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Not equal");
        }

        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(s);
        for(int i=0;i<s.length();i++){
            System.out.print(s.charAt(i));
        }
        System.out.println();
        String str=s.substring(0,3);

        System.out.println(str);
        
    }
    
}
