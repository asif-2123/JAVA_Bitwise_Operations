import java.util.*;

public class Set_ithbit {
    public static int set_ithbit( int i , int n ) {
        int bitMask = 1 << i ;                 // left shifting to the place where we need to get 1
        return n|bitMask ;                     // Using Binary OR to make that place 1 in every case and return
    }
    public static void main(String args []) {
        Scanner sc = new Scanner ( System.in ) ;
        System.out.print("Enter the position you want to set :");
        int i = sc.nextInt();
        System.out.print("Enter the no. :");
        int n = sc.nextInt();
        System.out.println(set_ithbit(i , n));
    }
}
