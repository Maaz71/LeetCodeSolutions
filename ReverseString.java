import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.next();

//        StringBuffer sb = new StringBuffer(name); //One Way
//        sb.reverse();
//        System.out.println(sb);

//        StringBuilder sb = new StringBuilder(); // Second Way
//        sb.append(name);
//        sb.reverse();
//        System.out.println(sb);

        String rev ="";  //Third Way
        int len = name.length();
        for(int i= len-1;i>=0;i--)
        {
            rev = rev+name.charAt(i);
        }
        System.out.println(rev);

    }
}
