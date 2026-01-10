import java.util.*;

public class Clear_i_bit {
    public static int clear_ibits ( int n , int i) {
        int bitMask = ((-1) << i) ;        // -1 = 111111 and leftshifting this so that getting 0 upto i numbers
        return n & bitMask ;               //to clear
    }
    public static void main ( String args[]) {
        System.out.println(clear_ibits(15 , 2));
    }
    
}
