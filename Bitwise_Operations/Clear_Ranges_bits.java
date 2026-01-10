import java.util.*;

public class Clear_Ranges_bits {
    public static int clear_in_ranges ( int n , int i , int j ) {
        int a = (~0) << (j+1) ;          //shifting in 1 upto the positon j+1
        int b = ( 1<< i) - 1;            // 1<<i = 1 * 2^i  , so that the last elements upto i-1 is 0
        int newBit = a|b;                // Using OR so that the position i to j will all be 0
        return n & newBit;               // Using AND to clear between the ranges
    }
    public static void main (String args[]) {
        System.out.println(clear_in_ranges(10 , 2 , 4));
    }
    
}
