import java.util.*;

public class Clear_ithbit {
    public static int clear_ith ( int n , int i ) {
        int bitMask = ~( 1 << i ) ;            // Using Binary NOT of the left shift of i to get 0
        return n & bitMask ;                   // Using Binary AND to get 0 in any case it happens
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in ) ;
        System.out.print("Enter the number : " );
        int n = sc.nextInt();
        System.out.print("Enter that position where you want to make 0 : ");
        int i = sc.nextInt();
        System.out.println(clear_ith(n, i));
    }
}
