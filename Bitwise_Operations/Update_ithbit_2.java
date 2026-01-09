import java.util.*;

public class Update_ithbit_2 {
    // code for SET_ith_bit
    public static int set_ith( int n , int i) {
        int bitMask = 1<<i ;
        return n | bitMask ;
    }
    // code for CLEAR_ith_bit
    public static int clear_ith(int n , int i) {
        int bitMask = ~(1<<i) ;
        return n & bitMask ;
    }
    // code for Update
    public static int update ( int n , int i , int newBit) {
        n = clear_ith(n, i) ;                  // clearing the ith position no matter what is there
        int bitMask = newBit << i ;            // left shifting to ith position 
        return n|bitMask ;                     /*  if newBit = 0 then it will return n so that means we already cleared
                                                and newBit !=0 the OR with 1 will set that ith position to 1  */
    }
    public static void main(String[] args) {
        System.out.println(update(10, 2, 1));
    }

    
}
