public class String2 {
    public static void main(String[] args) {
        StringBuilder s=new StringBuilder("jim");
        s.setCharAt(0, 'm');
        System.out.println(s);
        s.insert(0,'u');
        System.out.println(s);
        s.append('u');
        System.out.println(s);
        s.delete(0, 1);
        System.out.println(s);
        s.delete(3,s.length());
        System.out.println(s);
    }
}
