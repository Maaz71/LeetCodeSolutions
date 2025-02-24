import java.util.Scanner;

public class CountnumberOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int count = 0;
        while(num1 !=0){
            num1 = num1/10;
            count++;
    }
        System.out.println("Number of digits: "+ count );

    }


}
