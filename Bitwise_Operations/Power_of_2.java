import java.util.*;

public class Power_of_2 {
    public static boolean isPowerOfTwo ( int n ) {
        return ( n & (n-1) ) == 0 ;            /*if its a power of two then it will be 1 then many zero
                                     and the no. before it contains that position of 1 in power of 2 be 0 
                                      and using AND clears all and gives zero */
    }

    public static void main(String args[]) {
        System.out.println(isPowerOfTwo(13));
        
    }
    
}
