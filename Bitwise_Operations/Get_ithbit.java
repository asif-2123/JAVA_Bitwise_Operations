import java.util.*;

public class Get_ithbit {
    public static int get_ith (int i , int n ) {
        int bitMask = 1 << i;               //left shifting upto the place where we need to check
        
        // check using Binary AND
        if (( n & bitMask) == 0 ) {
            return 0 ;
        }
        else {
            return 1 ;
        }
    }

    public static void main ( String args []) {
        Scanner sc = new Scanner ( System.in ) ;
        System.out.print("Enter the position you want to check :");
        int i = sc.nextInt();
        System.out.print("Enter the no. :");
        int n = sc.nextInt();
        System.out.println(get_ith(i, n)) ;
    }
    
    
}
