import java.util.*;

public class Count_set_bits {
    public static int count_Setbits ( int n ) {
        int count = 0 ;                   // initialising count
        while ( n > 0 ) {                 // count until n becomes 0 because at 0 there's no set bits left

            if ( ( n & 1 ) != 0 ) {       // To check the last elemnt is 1 (set) or not
                count ++ ;                // count increases if it's 1
            } 
            n = n >> 1 ;                  // Right shifting to the remove the LSb and going more wider
        }
        return count ;
    }

    public static void main(String[] args) {
        System.out.println(count_Setbits (15));
    }
    
}
