import java.util.*;

public class Update_ithbit {

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
    public static int update(int n , int i , int newBit) {
        // check the position to be changed if 0 then set and if 1 then clear
        if (newBit == 0) {                           
            return clear_ith(n, i);
        }
        else{
            return set_ith(n, i) ;
        }
    }
    public static void main(String[] args) {
        System.out.println(update(10, 3, 0) );
    }
    
}
